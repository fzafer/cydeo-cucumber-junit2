package com.cydeo.tests;

import com.cydeo.pages.FleetGru_MainPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.nl.Stel;
import org.junit.Test;

public class fleetgruTest {

    @Test
    public void test(){
        FleetGru_MainPage fleetGruMainPage = new FleetGru_MainPage();

        Driver.getDriver().get("https://qa.fleetgru.com/user/login");

       // fleetGruMainPage.username.sendKeys(ConfigurationReader.getProperty("fleetgru-driver-username"));
        fleetGruMainPage.password.sendKeys("bbbbbb");
        fleetGruMainPage.loginButton.click();




    }
}
