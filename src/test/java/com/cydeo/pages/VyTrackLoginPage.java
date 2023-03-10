package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "prependedInput")
    public WebElement usernameForm;

    @FindBy(id = "prependedInput2")
    public WebElement passwordForm;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    public void login(String username, String password){
        usernameForm.sendKeys(username);
        passwordForm.sendKeys(password);
        loginButton.click();
    }
}
