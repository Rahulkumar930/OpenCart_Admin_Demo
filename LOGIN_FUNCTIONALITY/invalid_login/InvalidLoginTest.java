package invalid_login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class InvalidLoginTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void invalidLoginTest() {

        System.out.println("Invalid Login Test Started");

        // Enter wrong username
        driver.findElement(By.id("input-username"))
              .sendKeys("wronguser");

        // Enter wrong password
        driver.findElement(By.id("input-password"))
              .sendKeys("wrongpassword");

        // Click Login
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Check error message
        String errorMessage =
                driver.findElement(By.cssSelector(".alert-danger")).getText();

        System.out.println("Error Message: " + errorMessage);

        Assert.assertTrue(errorMessage.length() > 0);

        System.out.println("Invalid Login Test Passed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}