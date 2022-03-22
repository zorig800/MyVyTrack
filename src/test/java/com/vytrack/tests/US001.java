package com.vytrack.tests;

import com.vytrack.pages.HomePage;
import com.vytrack.utilities.VyTrackUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US001 extends DataProvide{

    @Test
    public void verifyModulesAsSalesManager(){
        VyTrackUtils.loginAsSalesManager();
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing", "Reports & Segments", "System"));

        actualModuleNames.add(homePage.dashboardMenu.getText());
        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.salesMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.marketingMenu.getText());
        actualModuleNames.add(homePage.reportAndSegmentsMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);


    }

    @Test
    public void verifyModulesAsStoreManager(){
        VyTrackUtils.loginAsStoreManager();
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing", "Reports & Segments", "System"));

        actualModuleNames.add(homePage.dashboardMenu.getText());
        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.salesMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.marketingMenu.getText());
        actualModuleNames.add(homePage.reportAndSegmentsMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);


    }

    @Test
    public void verifyModulesAsDriver(){

        VyTrackUtils.loginAsDriver();
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Fleet", "Customers", "Activities", "System"));


        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);

    }


    @Test (dataProvider = "salesManager")
    public void verifyModulesAs_SalesManager(String username, String password){

        VyTrackUtils.login(username, password);
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing", "Reports & Segments", "System"));

        actualModuleNames.add(homePage.dashboardMenu.getText());
        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.salesMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.marketingMenu.getText());
        actualModuleNames.add(homePage.reportAndSegmentsMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);

    }

    @Test (dataProvider = "storeManager")
    public void verifyModulesAs_StoreManager(String username, String password){

        VyTrackUtils.login(username, password);
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing", "Reports & Segments", "System"));

        actualModuleNames.add(homePage.dashboardMenu.getText());
        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.salesMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.marketingMenu.getText());
        actualModuleNames.add(homePage.reportAndSegmentsMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);

    }

    @Test (dataProvider = "driver")
    public void verifyModulesAs_Driver(String username, String password){

        VyTrackUtils.login(username, password);
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        expectedModuleNames.addAll(Arrays.asList("Fleet", "Customers", "Activities", "System"));


        actualModuleNames.add(homePage.fleetMenu.getText());
        actualModuleNames.add(homePage.customerMenu.getText());
        actualModuleNames.add(homePage.activitiesMenu.getText());
        actualModuleNames.add(homePage.systemMenu.getText());

        Assert.assertEquals(actualModuleNames, expectedModuleNames);

    }

    @Test (dataProvider = "allCredential")
    public void verifyModulesAs_User(String username, String password){

        VyTrackUtils.login(username, password);
        HomePage homePage = new HomePage();

        List<String> actualModuleNames = new ArrayList<>();
        List<String> expectedModuleNames = new ArrayList<>();

        if(username.contains("manager")) {

            expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                    "Marketing", "Reports & Segments", "System"));

            actualModuleNames.add(homePage.dashboardMenu.getText());
            actualModuleNames.add(homePage.fleetMenu.getText());
            actualModuleNames.add(homePage.customerMenu.getText());
            actualModuleNames.add(homePage.salesMenu.getText());
            actualModuleNames.add(homePage.activitiesMenu.getText());
            actualModuleNames.add(homePage.marketingMenu.getText());
            actualModuleNames.add(homePage.reportAndSegmentsMenu.getText());
            actualModuleNames.add(homePage.systemMenu.getText());

            Assert.assertEquals(actualModuleNames, expectedModuleNames);

        }else{

            expectedModuleNames.addAll(Arrays.asList("Fleet", "Customers", "Activities", "System"));


            actualModuleNames.add(homePage.fleetMenu.getText());
            actualModuleNames.add(homePage.customerMenu.getText());
            actualModuleNames.add(homePage.activitiesMenu.getText());
            actualModuleNames.add(homePage.systemMenu.getText());

            Assert.assertEquals(actualModuleNames, expectedModuleNames);

        }


    }


}
