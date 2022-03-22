package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String costumerName) {

        String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        String verifiyTitle = customerDateCell.getText();

        return verifiyTitle;
    }

    public static void orderVerify(WebDriver driver,String costumerName,String expectedOrderDate){
        String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        String actualOrderDate =customerDateCell.getText();
        Assert.assertEquals(actualOrderDate,expectedOrderDate,"failed");
        //Method #2 info:
        //• Name: orderVerify ()
        //• Return type: void
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //• Arg3: String expectedOrderDate
        //This method should accept above mentioned arguments and internally assert
        //expectedOrderDate matching actualOrderDate.
    }


}
