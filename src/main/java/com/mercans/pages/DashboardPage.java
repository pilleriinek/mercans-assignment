package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By leaves = By.id("leaves");
    private final By myLeaves = By.linkText("My leaves");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    public LeavesPage openMyLeaves() {
        helper.findElement(leaves).click();
        helper.findElement(myLeaves).click();
        return new LeavesPage(driver);
    }
}
