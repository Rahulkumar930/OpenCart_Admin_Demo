package search_order;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class SearchOrderTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void searchOrderTest() {

        System.out.println("Search Order Test Started");

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

        // Enter Order ID
        driver.findElement(By.id("input-order-id"))
              .sendKeys("1");

        // Click Filter
        driver.findElement(By.id("button-filter"))
              .click();

        System.out.println("Search Order Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}