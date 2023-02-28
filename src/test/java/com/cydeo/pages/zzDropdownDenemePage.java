package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class zzDropdownDenemePage {

    public zzDropdownDenemePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//select[@id='day']")
    public WebElement dayDropdown;

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//select[@id='year']")
    public WebElement yearDropdown;



}
