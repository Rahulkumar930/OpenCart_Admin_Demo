package com.opencart.pages;

import org.openqa.selenium.By;

import com.opencart.config.ConfigReader;

public class LoginPage extends BasePage {

    private ConfigReader configReader;

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage() {
        super();
        configReader = new ConfigReader();
    }

    public void enterUsername() {
        enterText(usernameField, configReader.getUsername());
    }

    public void enterPassword() {
        enterText(passwordField, configReader.getPassword());
    }

    public void clickLogin() {
        clickElement(loginButton);
    }

    public void login() {
        enterUsername();
        enterPassword();
        clickLogin();
    }
}