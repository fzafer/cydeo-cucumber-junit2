package com.cydeo.step_definitions;

import com.cydeo.pages.FleetGru_MainPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FleetGru_StepDefs {

    FleetGru_MainPage fleetGruMainPage = new FleetGru_MainPage();
    String profileName1 = "";
    String profileName2 = "";

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.fleetgru.com/user/login");
    }

    @When("The user logs as a driver")
    public void the_user_logs_as_a_driver() {
        fleetGruMainPage.username.sendKeys(ConfigurationReader.getProperty("fleetgru-driver-username"));
        fleetGruMainPage.password.sendKeys(ConfigurationReader.getProperty("fleetgru-password"));
        fleetGruMainPage.loginButton.click();

    }

    @Then("The user is on the Quick Launcpad page")
    public void the_user_is_on_the_quick_launcpad_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetGruMainPage.QuickLaunchpadText));

        Assert.assertEquals(fleetGruMainPage.QuickLaunchpadText.getText(), "Quick Launchpad");
    }


    @When("The user logs as a sales manager")
    public void the_user_logs_as_a_sales_manager() {
        fleetGruMainPage.username.sendKeys(ConfigurationReader.getProperty("fleetgru-salesmanager-username"));
        fleetGruMainPage.password.sendKeys(ConfigurationReader.getProperty("fleetgru-password"));
        fleetGruMainPage.loginButton.click();
    }

    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetGruMainPage.DashboardText));

        Assert.assertTrue(fleetGruMainPage.DashboardText.getText().contains("Dashboard"));
    }


    @When("The user logs as a store manager")
    public void the_user_logs_as_a_store_manager() {
        fleetGruMainPage.username.sendKeys(ConfigurationReader.getProperty("fleetgru-storemanager-username"));
        fleetGruMainPage.password.sendKeys(ConfigurationReader.getProperty("fleetgru-password"));
        fleetGruMainPage.loginButton.click();
    }


    @When("The user enters an invalid password")
    public void the_user_enters_an_invalid_password() {
        fleetGruMainPage.username.sendKeys(ConfigurationReader.getProperty("fleetgru-storemanager-username"));
        fleetGruMainPage.password.sendKeys("invalid");
        fleetGruMainPage.loginButton.click();
    }

    @Then("The user sees {string}")
    public void the_user_sees(String string) {
        String invalidCredentialsText = "Invalid user name or password.";
        Assert.assertEquals(fleetGruMainPage.invalidPasswordText.getText(), invalidCredentialsText);
    }

    @When("The user enters an invalid username")
    public void the_user_enters_an_invalid_username() {
        fleetGruMainPage.username.sendKeys("invalid");
        fleetGruMainPage.password.sendKeys(ConfigurationReader.getProperty("fleetgru-password"));
        fleetGruMainPage.loginButton.click();
    }


    @When("The user enters a username without a password")
    public void the_user_enters_a_username_without_a_password() {
        fleetGruMainPage.username.sendKeys("something");
        fleetGruMainPage.loginButton.click();
    }

    @Then("The user sees {string} in password field")
    public void the_user_sees_in_password_field(String string) {
        Assert.assertEquals(fleetGruMainPage.password.getAttribute("required"),"true");

    }

    @When("The user enters a password without a username")
    public void the_user_enters_a_password_without_a_username() {
        fleetGruMainPage.password.sendKeys("something");
        fleetGruMainPage.loginButton.click();
    }
    @Then("The user sees {string} in username field")
    public void the_user_sees_in_username_field(String string) {
        Assert.assertEquals(fleetGruMainPage.username.getAttribute("required"),"true");
    }

    @When("The user does not enter a username and a password")
    public void the_user_does_not_enter_a_username_and_a_password() {
        fleetGruMainPage.loginButton.click();
    }

    @When("The user clicks on the forgot password link")
    public void the_user_clicks_on_the_forgot_password_link() {
        fleetGruMainPage.forgotPasswordLink.click();
    }

    @Then("The user sees landed on the Forgot Password page")
    public void the_user_sees_landed_on_the_forgot_password_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.fleetgru.com/user/reset-request"));
    }

    @Then("The user sees {string} link exists and clickable")
    public void the_user_sees_link_exists_and_clickable(String string) {
        Assert.assertTrue(fleetGruMainPage.rememberMeText.getText().equals("Remember me on this computer"));
        Assert.assertTrue(fleetGruMainPage.rememberMeCheckBox.isEnabled());
    }

    @Then("The user sees the password in bullet signs by default")
    public void the_user_sees_the_password_in_bullet_signs_by_default() {
        Assert.assertTrue(fleetGruMainPage.password.getAttribute("type").equals("password"));
    }

    @When("The user clicks on the Enter key on the keyboard")
    public void the_user_clicks_on_the_enter_key_on_the_keyboard() {
        fleetGruMainPage.username.sendKeys("something");
        fleetGruMainPage.password.sendKeys("something" + Keys.ENTER);
    }
    @Then("The user sees it worked as the login button")
    public void the_user_sees_it_worked_as_the_login_button() {
        //so the user sees invalid username password warning
        String invalidCredentialsText = "Invalid user name or password.";
        Assert.assertEquals(fleetGruMainPage.invalidPasswordText.getText(), invalidCredentialsText);
    }

    @When("The user sees the name in the profile")
    public void the_user_sees_the_name_in_the_profile() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetGruMainPage.QuickLaunchpadText));

        profileName1 = fleetGruMainPage.profileName.getText();
        System.out.println("profileName1 = " + profileName1);

        fleetGruMainPage.profileName.click();
        BrowserUtils.sleep(1);
        fleetGruMainPage.logoutButton.click();
        BrowserUtils.sleep(1);
    }

    @When("The user sees again the name in the profile")
    public void the_user_sees_again_the_name_in_the_profile() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetGruMainPage.DashboardText));

        profileName2 = fleetGruMainPage.profileName.getText();
        System.out.println("profileName2 = " + profileName2);

    }
    @Then("Verify the names are not the same")
    public void verify_the_names_are_not_the_same() {
        Assert.assertNotEquals(profileName1,profileName2);
    }


    @When("The user logs out")
    public void the_user_logs_out() {
        fleetGruMainPage.profileName.click();
        BrowserUtils.sleep(1);
        fleetGruMainPage.logoutButton.click();
        BrowserUtils.sleep(1);
    }

    @Then("The user sees landing on the login page")
    public void the_user_sees_landing_on_the_login_page() {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.fleetgru.com/user/login");
    }

    @When("The user clicks step back button")
    public void the_user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @When("The user closes all the tabs")
    public void the_user_closes_all_the_tabs() {
        Driver.closeDriver();

    }
    @When("The user opens Dashboard page")
    public void the_user_opens_dashboard_page() {
        Driver.getDriver().get("https://qa.fleetgru.com/");
    }

    @When("The user wait for {int} mins")
    public void the_user_wait_for_mins(Integer int1) {
        BrowserUtils.sleep(181);
    }

}