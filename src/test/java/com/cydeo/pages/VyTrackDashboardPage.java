package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboardPage {

    public VyTrackDashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement fullName;

    @FindBy(xpath="//*[.=\"Logout\"]")
    public WebElement logOut;

    public void logOut(){
        fullName.click();
        logOut.click();
    }
}
