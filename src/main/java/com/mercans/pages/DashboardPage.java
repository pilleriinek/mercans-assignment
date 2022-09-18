package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By leaves = By.id("leaves");
    private final By myLeaves = By.linkText("My leaves");
    private final By approvals = By.linkText("Approvals");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    public MyLeavesPage openMyLeaves() {
        helper.findElement(leaves).click();
        helper.findElement(myLeaves).click();
        return new MyLeavesPage(driver);
    }

    public ApprovalsPage openApprovals() {
        helper.findElement(leaves).click();
        helper.findElement(approvals).click();
        return new ApprovalsPage(driver);
    }
}
