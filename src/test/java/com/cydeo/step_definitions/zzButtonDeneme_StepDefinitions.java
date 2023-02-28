package com.cydeo.step_definitions;

import com.cydeo.pages.zzButtonsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class zzButtonDeneme_StepDefinitions {

    zzButtonsPage zzButtonsPage = new zzButtonsPage();

    @Given("User is on cydeo buttons home page")
    public void user_is_on_cydeo_buttons_home_page() {
        Driver.getDriver().get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.sleep(2);
    }
    @When("User clicks on the first button")
    public void user_clicks_on_the_first_button() {
        zzButtonsPage.button1.click();
        BrowserUtils.sleep(1);
    }
    @Then("User sees {string} is displayed")
    public void user_sees_is_displayed(String string) {
        System.out.println("zzButtonsPage.text1.getText() = " + zzButtonsPage.text1.getText());
        Assert.assertTrue(zzButtonsPage.text1.isDisplayed());
    }
}
