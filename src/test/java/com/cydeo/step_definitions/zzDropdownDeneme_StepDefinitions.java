package com.cydeo.step_definitions;

import com.cydeo.pages.zzDropdownDenemePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class zzDropdownDeneme_StepDefinitions {

    zzDropdownDenemePage zzDropdownDenemePage1 = new zzDropdownDenemePage();


    @Given("User is on cydeo dropdown home page")
    public void user_is_on_cydeo_dropdown_home_page() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.sleep(2);


        //  String url = ConfigurationReader.getProperty("zzDropdownDenemeUrl");
      //  Driver.getDriver().get(url);
    }
 //   @When("User clicks on the month from the dropdown menu")
 //   public void user_clicks_on_the_month_from_the_dropdown_menu() {

//    }
    @When("User clicks {string} from the dropdown menu")
    public void user_clicks_from_the_dropdown_menu(String string) {
        Select monthDropdownObj = new Select(zzDropdownDenemePage1.monthDropdown);

        monthDropdownObj.selectByVisibleText(string);

    }

    @Then("User sees {string} is selected")
    public void user_sees_is_selected(String string) {
        Select monthDropdownObj = new Select(zzDropdownDenemePage1.monthDropdown);
        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(zzDropdownDenemePage1.monthDropdown);
       // BrowserUtils.dropdownSelectedVerify(monthDropdownObj, string);

        //expectedMonth = "December";
      //  Select monthDropdownObj = new Select(zzDropdownDenemePage1.monthDropdown);
       String actualMonth = monthDropdownObj.getFirstSelectedOption().getText();

       Assert.assertEquals(string, actualMonth);






      // String actualValue = monthDropdownObj.getFirstSelectedOption().getText();
       // System.out.println("expected month = " + expectedMonths);
        //Assert.assertEquals(expectedValue, actualValue);
        //Assert.assertEquals(expectedMonths, actualMonths);

    }

}
//        //This method will return us the List of String of given dropdown's options
//        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
//
//        Assert.assertEquals(expectedMonths, actualMonths);
//        //Assert will check the size of the lists first. If it is matching it will check content 1 by 1.