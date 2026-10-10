package com.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.CustomersPage;
import com.opencart.pages.LoginPage;

public class CustomersUITest extends BaseTest {

    @Test
    public void TC_CUST_UI_001() {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        CustomersPage customersPage = new CustomersPage();
        customersPage.openCustomersPage();

        Assert.assertTrue(
                customersPage.isPageLoaded(),
                "Customers page is not displayed"
        );
    }
}