package com.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencart.config.ConfigReader;
import com.opencart.driver.DriverManager;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();

        ConfigReader configReader = new ConfigReader();

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(configReader.getExplicitWait())
        );
    }

    protected WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void clickElement(By locator) {
        WebElement element = findElement(locator);
        element.click();
    }

    protected void enterText(By locator, String text) {
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        WebElement element = findElement(locator);
        return element.getText();
    }

    protected boolean isElementVisible(By locator) {
        try {
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator)
            );
            return element.isDisplayed();
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }
}