package com.cydeo.step_definitions;

import com.cydeo.pages.SahibindenPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class sahibinden {
    SahibindenPages sahibindenPages = new SahibindenPages();


    @Given("open sahibinden com")
    public void open_sahibinden_com() {
        Driver.getDriver().get("https://sahibinden.com");
        BrowserUtils.sleep(2);
        sahibindenPages.cookies.click();

    }

    @When("user enter a car brand")
    public void user_enter_a_car_brand() {
        sahibindenPages.otomobil.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
      // js.executeScript("arguments[0].scrollIntoView(true)", sahibindenPages.ferrari);
        js.executeScript("arguments[0]. click()", sahibindenPages.ferrari);

        BrowserUtils.sleep(1);

        sahibindenPages.ferrari.click();
    }

    @When("user enter the car model")
    public void user_enter_the_car_model() {
        sahibindenPages.jazz.click();
        BrowserUtils.sleep(1);
        sahibindenPages.jazz.click();
    }
}