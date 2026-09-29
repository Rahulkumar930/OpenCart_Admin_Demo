package edit_product;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class EditProductTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void editProductTest() {

        System.out.println("Edit Product Test Started");

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

        // Click Edit button for the product
        driver.findElement(By.cssSelector(
                "a[data-bs-original-title='Edit']"))
              .click();

        // Change Product Name
        driver.findElement(By.id("input-name"))
              .clear();

        driver.findElement(By.id("input-name"))
              .sendKeys("Updated Test Product");

        // Change Model
        driver.findElement(By.id("input-model"))
              .clear();

        driver.findElement(By.id("input-model"))
              .sendKeys("TP002");

        // Save changes
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        System.out.println("Edit Product Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}