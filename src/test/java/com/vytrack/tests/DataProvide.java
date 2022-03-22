package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VyTrackUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public abstract class DataProvide {

    @BeforeMethod
    public void setUp() {
        //Go to VY TRACK Page
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @AfterMethod
    public void tearDown() {
        VyTrackUtils.logout();
        Driver.closeDriver();
    }

    @DataProvider(name = "salesManager")
    public Object[][] salesManagers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("sales_manager_username1"), ConfigurationReader.getProperty("password")},
                {ConfigurationReader.getProperty("sales_manager_username2"), ConfigurationReader.getProperty("password")},
        };
    }

    @DataProvider(name = "storeManager")
    public Object[][] storeManagers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("store_manager_username1"), ConfigurationReader.getProperty("password")},
                {ConfigurationReader.getProperty("store_manager_username2"), ConfigurationReader.getProperty("password")},
        };
    }

    @DataProvider(name = "driver")
    public Object[][] drivers() {
        return new Object[][]{
                {ConfigurationReader.getProperty("driver_username1"), ConfigurationReader.getProperty("password")},
                {ConfigurationReader.getProperty("driver_username2"), ConfigurationReader.getProperty("password")},
        };
    }

    @DataProvider(name = "allCredential")
    public Object[][] allCredentials() {
        return new Object[][]{
                {"salesmanager101", "UserUser123" },
                {"salesmanager102", "UserUser123" },
                {"salesmanager103", "UserUser123" },
                {"salesmanager104", "UserUser123" },
                {"storemanager51", "UserUser123" },
                {"storemanager52", "UserUser123" },
                {"storemanager53", "UserUser123" },
                {"storemanager54", "UserUser123" },
                {"user1", "UserUser123"},
                {"user2", "UserUser123"},
                {"user3", "UserUser123"},
                {"user4", "UserUser123"},
                {"user5", "UserUser123"},
                {"user6", "UserUser123"},
        };
    }



}