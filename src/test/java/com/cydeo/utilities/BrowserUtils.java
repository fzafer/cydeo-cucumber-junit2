package com.cydeo.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
      /*
    this meth will accept int seconds and execute thread sleep
     */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    /*
    this method accepts 3 args
         */
    public static void switchToWindowAndVerify(String expectedInUrl, String expectedIntitle){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        // Assert: title contains  etsy
        for (String each :allWindowsHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("current url: " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualtitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualtitle.contains(expectedIntitle));

    }

    /*
    this method accepts a string expectedtitle and asserts if it is true
         */

    public static void verifyTitle (String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method will accept a String as expected value and verify actual URL CONTAINS the value.
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    /**
     * This method will accept a dropdown as a WebElement
     * and return all the options' text in a List of String.
     *
     * @param dropdownElement
     * @return List<String> actualOptionsAsString
     */

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);

//List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all ACTUAL month <options> as a string
        List<String> actualOptionsAsString= new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;

    }

}
