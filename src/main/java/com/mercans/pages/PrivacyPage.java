package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivacyPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By privacyCheckbox = By.className("checkbox-custom");
    private final By continueButton = By.className("button-action--save");

    public PrivacyPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    public PrivacyPage clickCheckbox() {
        helper.findElement(privacyCheckbox).click();
        return this;
    }

    public DashboardPage agreePrivacy() {
        helper.findElement(continueButton).click();
        return new DashboardPage(driver);
    }
}
