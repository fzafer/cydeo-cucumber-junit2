package com.cydeo.tests;

import com.cydeo.pages.VyTrackDashboardPage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackTest {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackUrl"));
    }

    @After
    public void teardown(){
        Driver.closeDriver();
    }

    @Test
    public void loginDDTTest() throws IOException{

        String filePath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("data");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String userName = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstName = sheet.getRow(i).getCell(2).toString();
            String lastName = sheet.getRow(i).getCell(3).toString();

            vyTrackLoginPage.login(userName, password);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
           // wait.until(ExpectedConditions.visibilityOf(dashboardPage.fullName));
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            //kaybolana kadar bekliyoruz
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            String actualFullName = dashboardPage.fullName.getText();
            System.out.println("actualFullName = " + actualFullName);

            XSSFCell resultCell = sheet.getRow(i).getCell(4);
            XSSFCell resultCell2 = sheet.getRow(i).getCell(5);

            if (actualFullName.contains(firstName) && actualFullName.contains(lastName)) {
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
                resultCell2.setCellValue(actualFullName);
            }else{
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }

            dashboardPage.logOut();
            BrowserUtils.sleep(3);
        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        in.close();
        outputStream.close();






    }

}
