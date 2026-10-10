package com.opencart.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.opencart.config.ConfigReader;
import com.opencart.driver.DriverManager;

public class BaseTest {

    protected ConfigReader configReader;

    @BeforeMethod
    public void setUp() {

        configReader = new ConfigReader();

        DriverManager.initializeDriver();

        DriverManager.getDriver().get(
                configReader.getBaseURL()
        );
    }

    @AfterMethod
    public void tearDown() {

        DriverManager.quitDriver();
    }
}