package add_product;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class AddProductTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void addProductTest() {

        System.out.println("Add Product Test Started");

        // Login
        driver.findElement(By.id("input-username"))
              .sendKeys("YOUR_USERNAME");

        driver.findElement(By.id("input-password"))
              .sendKeys("YOUR_PASSWORD");

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Open Products
        driver.findElement(By.linkText("Products"))
              .click();

        // Click Add New
        driver.findElement(By.cssSelector(
                "a[data-bs-original-title='Add New']"))
              .click();

        // Product Name
        driver.findElement(By.id("input-name"))
              .sendKeys("Test Product");

        // Meta Tag Title
        driver.findElement(By.id("input-meta-title"))
              .sendKeys("Test Product");

        // Model
        driver.findElement(By.id("input-model"))
              .sendKeys("TP001");

        // Save
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        System.out.println("Add Product Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}