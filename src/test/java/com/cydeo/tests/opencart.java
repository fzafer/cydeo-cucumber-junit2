package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.MyUtils.Xpath;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class opencart {

    @Test
    public void test(){


    Driver.getDriver().get("https://demo.opencart.com/admin/index.php");

    WebElement username= Driver.getDriver().findElement(By.id("input-username"));
    WebElement password= Driver.getDriver().findElement(By.id("input-password"));
    WebElement loginBtn= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));

        username.clear();
        username.sendKeys("demo");
        password.clear();
        password.sendKeys("demo");
        loginBtn.click();



       // WebElement dash = Xpath.text("Dashboard");
       // Xpath.id("button-admin").click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();



}
 }