package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SahibindenPages {

    public SahibindenPages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
        public WebElement cookies;

        @FindBy(xpath = "//a[@title='Otomobil']")
        public WebElement otomobil;

    @FindBy(xpath = "//*[.='Ferrari']")
    public WebElement ferrari;

    @FindBy(xpath = "//a[@href='/honda']")
    public WebElement honda2;


        @FindBy(xpath = "//*[.='Honda']")
        public WebElement honda;

        @FindBy(xpath = "//*[.='Hyundai']")
        public WebElement hyundai;

        @FindBy(xpath = "//a[@title='Jazz']")
        public WebElement jazz;

        @FindBy(xpath = "//a[@id='advancedSorting']")
        public WebElement siralama;

        @FindBy(xpath = "//a[@title='Fiyata göre (Önce en düşük)']")
        public WebElement endusuk;

}