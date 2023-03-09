package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetGru_MainPage {



    //1.create constructor and instances

    public FleetGru_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="prependedInput")
    public WebElement username;

    @FindBy(id ="prependedInput2")
    public WebElement password;

    @FindBy(id ="_submit")
    public WebElement loginButton;

    @FindBy(linkText ="Forgot your password?")
    public WebElement forgotYourPasswordText;

    @FindBy(xpath ="//*[@id=\"login-form\"]/fieldset/div[1]/div")
    public WebElement invalidPasswordText;

    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement QuickLaunchpadText;

    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement DashboardText;

    @FindBy(xpath ="//*[@id=\"login-form\"]/fieldset/div[3]/a")
    public WebElement forgotPasswordLink;

    @FindBy(xpath ="//*[@id=\"login-form\"]/fieldset/div[2]/label/span[2]")
    public WebElement rememberMeText;

    @FindBy(xpath ="//*[@id=\"remember_me\"]")   //*[@id="login-form"]/fieldset/div[2]/label/span[1]
    public WebElement rememberMeCheckBox;

    @FindBy(xpath ="//*[@id=\"user-menu\"]/a")
    public WebElement profileName;

    @FindBy(xpath ="//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logoutButton;








}
