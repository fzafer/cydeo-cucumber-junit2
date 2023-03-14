package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetGru_DashBoardPAge {



    //1.create constructor and instances

    public FleetGru_DashBoardPAge(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath ="//*[@id=\"user-menu\"]/a")
    public WebElement profileName;

    @FindBy(xpath ="//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logoutButton;


    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement QuickLaunchpadText;

    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement DashboardText;





}
