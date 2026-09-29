package view_order;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class ViewOrder extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void viewOrderTest() {

        System.out.println("View Order Test Started");

        // Login
        driver.findElement(By.id("input-username"))
              .sendKeys("YOUR_USERNAME");

        driver.findElement(By.id("input-password"))
              .sendKeys("YOUR_PASSWORD");

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Open Orders
        driver.findElement(By.linkText("Orders"))
              .click();

        // Click View button
        driver.findElement(By.cssSelector(
                "a[data-bs-original-title='View']"))
              .click();

        System.out.println("View Order Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}