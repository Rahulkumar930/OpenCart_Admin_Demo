package com.opencart.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private By dashboardHeading =
            By.xpath("//h1[contains(normalize-space(), 'Dashboard')]");

    public DashboardPage() {
        super();
    }

    public boolean isDashboardDisplayed() {
        return isElementVisible(dashboardHeading);
    }
}