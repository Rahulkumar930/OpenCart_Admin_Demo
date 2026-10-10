package com.opencart.pages;

import org.openqa.selenium.By;

public class CustomersPage extends BasePage {

    private final By customersMenu = By.id("menu-customer");

    private final By customersLink =
            By.xpath("//a[contains(@href, 'route=customer/customer')]");

    private final By customersHeading =
            By.xpath("//h1[contains(normalize-space(), 'Customers')]");

    public CustomersPage() {
        super();
    }

    public void openCustomersPage() {
        clickElement(customersMenu);
        clickElement(customersLink);
    }

    public boolean isPageLoaded() {
        return isElementVisible(customersHeading);
    }

    public boolean isCustomersPageDisplayed() {
        return isPageLoaded();
    }
}