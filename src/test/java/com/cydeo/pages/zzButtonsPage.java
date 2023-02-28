package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zzButtonsPage {

    public zzButtonsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "//button[.='Button 1']")
    public WebElement button1;

    @FindBy(xpath = "//p[.='Clicked on button one!']")
    public WebElement text1;


}
