package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Dashboards' and contains(@class, 'title title-level-1')]")
    public WebElement dashboardMenu;
    // (xpath = "//span[@class='title title-level-1']") + indexing
    // (xpath = "//div[@id = 'main-menu']/ul/li/a/span")+ indexing
    // (xpath = "//div[@id = 'main-menu']/ul/li/a/span[contains(text(),'Dashboards')]

    @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[normalize-space()='Customers' and contains(@class, 'title title-level-1')]")
    public WebElement customerMenu;


    @FindBy(xpath = "//span[normalize-space()='Sales' and contains(@class, 'title title-level-1')]")
    public WebElement salesMenu;

    @FindBy(xpath = "//span[normalize-space()='Activities' and contains(@class, 'title title-level-1')]")
    public WebElement activitiesMenu;

    @FindBy(xpath = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]")
    public WebElement marketingMenu;

    @FindBy(xpath = "//span[normalize-space()='Reports & Segments' and contains(@class, 'title title-level-1')]")
    public WebElement reportAndSegmentsMenu;

    @FindBy(xpath = "//span[normalize-space()='System' and contains(@class, 'title title-level-1')]")
    public WebElement systemMenu;

    public List<WebElement> allModuleMenu = new ArrayList<>();


}
