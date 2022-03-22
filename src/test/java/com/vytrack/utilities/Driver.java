package com.vytrack.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating private constructor, so we are closing access to the object of this class
    // from outside the class
    private static WebDriver driver;

    private Driver (){ }

    public static WebDriver getDriver(){

        if (driver == null){
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){

                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver = new FirefoxDriver();
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new ChromeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }


    public static void closeDriver(){
        if(driver != null){
            driver.close();
            driver = null;
        }

    }


}
