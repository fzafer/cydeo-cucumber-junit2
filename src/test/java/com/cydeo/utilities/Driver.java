package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
create priv constructor, so we close access
to the obj of this class from outside to this class
 */

    private Driver(){}

    /*
    we make WebDriver private, because we want to
    close access from outside
    We make it static bc we ll use it in a static method
     */

    private static WebDriver driver;

    /*
    create a re-usable method which will return same
    driver when we call it
     */
    public static WebDriver getDriver(){

        if(driver==null){

            /*
            we read our browser type from configuration.properties
            this way, we can control which browseer is opened
            from outside our code, from conf prop
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            depending on the brows type that will be return
            from conf prop file,
            switch statement will determine the case, and open the browser
            +             */

            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }




        }
        return driver;
    }
    /*
    if my driver is not null, we want it to be null, adfter using quit method
     */
    public static void closeDriver(){
        if(driver != null){
            driver.quit(); //this will terminate session
            driver = null;
        }
    }



}
