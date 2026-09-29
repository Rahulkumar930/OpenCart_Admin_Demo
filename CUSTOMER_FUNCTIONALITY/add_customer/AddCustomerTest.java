package add_customer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class AddCustomerTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void addCustomerTest() {

        System.out.println("Add Customer Test Started");

        // Login
        driver.findElement(By.id("input-username"))
              .sendKeys("YOUR_USERNAME");

        driver.findElement(By.id("input-password"))
              .sendKeys("YOUR_PASSWORD");

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Open Customers
        driver.findElement(By.linkText("Customers"))
              .click();

        // Click Add New
        driver.findElement(By.cssSelector("a[data-bs-original-title='Add New']"))
              .click();

        // Enter customer details
        driver.findElement(By.id("input-firstname"))
              .sendKeys("Rahul");

        driver.findElement(By.id("input-lastname"))
              .sendKeys("Kumar");

        driver.findElement(By.id("input-email"))
              .sendKeys("rahul12345@gmail.com");

        driver.findElement(By.id("input-password"))
              .sendKeys("Test@123");

        // Save customer
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        System.out.println("Add Customer Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}