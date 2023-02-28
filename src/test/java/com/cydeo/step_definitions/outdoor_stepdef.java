package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;

import java.util.List;

public class outdoor_stepdef {

    @Then("user should navigate to")
    public void user_should_navigate_to(List<String> url) {
    //    for (String each : url) {


     //       Driver.getDriver().get(each);
      //  }
      //  System.out.println(url);
      // Driver.getDriver().get(url.toString());

    }

    @Then("user should navigate to {string}")
    public void user_should_navigate_to(String string) {
        Driver.getDriver().get(string);
    }
}

