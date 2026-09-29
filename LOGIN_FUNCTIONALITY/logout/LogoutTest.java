package logout;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class LogoutTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void logoutTest() {

        System.out.println("Logout Test Started");

        // Login
        driver.findElement(By.id("input-username"))
              .sendKeys("YOUR_USERNAME");

        driver.findElement(By.id("input-password"))
              .sendKeys("YOUR_PASSWORD");

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        // Click Logout
        driver.findElement(By.linkText("Logout"))
              .click();

        // Verify login page is displayed
        boolean loginPageDisplayed =
                driver.findElement(By.id("input-username")).isDisplayed();

        Assert.assertTrue(loginPageDisplayed);

        System.out.println("Logout Test Passed");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}
