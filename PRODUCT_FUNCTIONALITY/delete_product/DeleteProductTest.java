package delete_product;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class DeleteProductTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void deleteProductTest() {

        System.out.println("Delete Product Test Started");

    
        driver.findElement(By.id("input-username"))
              .sendKeys("YOUR_USERNAME");

        driver.findElement(By.id("input-password"))
              .sendKeys("YOUR_PASSWORD");

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Open Products
        driver.findElement(By.linkText("Products"))
              .click();

        
        driver.findElement(By.name("selected[]"))
              .click();

       
        driver.findElement(By.cssSelector(
                "button[data-bs-original-title='Delete']"))
              .click();

        
        driver.switchTo().alert().accept();

        System.out.println("Delete Product Test Completed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}