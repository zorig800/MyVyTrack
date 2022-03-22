package com.vytrack.utilities;


import com.vytrack.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VyTrackUtils {


    public static void login() {
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // go to usernameInput clear it and input valid username
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("sales_manager_username1"));

        // go to passwordInput clear it and input password
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        // go to login button click it
        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);


    }

    public static void login(String username, String password) {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // go to usernameInput clear it and input valid username
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(username);

        // go to passwordInput clear it and input password
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(password);

        // go to login button click it
        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);

    }

    public static void loginAsDriver() {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // go to usernameInput clear it and input valid username
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username1"));

        // go to passwordInput clear it and input password
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        // go to login button click it
        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);

    }

    public static void loginAsStoreManager() {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // go to usernameInput clear it and input valid username
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("store_manager_username1"));

        // go to passwordInput clear it and input password
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        // go to login button click it
        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);

    }

    public static void loginAsSalesManager() {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // go to usernameInput clear it and input valid username
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("sales_manager_username1"));

        // go to passwordInput clear it and input password
        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        // go to login button click it
        loginPage.loginBtn.click();
        BrowserUtils.sleep(1);

    }

    public static void waitTillLoaderMaskDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void navigate(String superTab, String subTab) {

        String TabElementLocator = "//span[normalize-space()='" + superTab + "' and contains(@class, 'title title-level-1')]";

        WebElement TabElement = Driver.getDriver().findElement(By.xpath(TabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(TabElement).perform();

        String subModuleLocator = "//span[normalize-space()='" + subTab + "' and contains(@class, 'title title-level-2')]";
        WebElement subModuleElement = Driver.getDriver().findElement(By.xpath(subModuleLocator));

        //we are using for waiting until loader mask disappearing
        VyTrackUtils.waitTillLoaderMaskDisappear();
        subModuleElement.click();
        VyTrackUtils.waitTillLoaderMaskDisappear();
    }

    public static void logout() {

        BrowserUtils.sleep(1);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        WebElement userBlock = Driver.getDriver().findElement(By.xpath("//li[@id='user-menu']//a[@class='dropdown-toggle']"));
        userBlock.click();

        WebElement logoutBtn = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logoutBtn.click();

    }


}
