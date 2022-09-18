package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApprovePendingPage {
    private final WebDriver driver;
    private SeleniumHelper helper;
    private final By approveButton = By.className("button-action--save");
    private final By confirmationButton = By.id("confirmAction");
    private final By successMessage = By.className("Vue-Toastification__toast--success");

    public ApprovePendingPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    public ApprovePendingPage approvePendingLeave() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(approveButton).click();
        helper.findElement(confirmationButton).click();
        helper.findElement(successMessage).isDisplayed();
        return this;
    }
}
