package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class RequestLeavesPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By startDate = By.id(getCurrentDateWithDay(17));
    private final By endDate = By.id(getCurrentDateWithDay(19));
    private final By requestLeaveButton = By.className("button-action--save");
    private final By confirmationButton = By.id("confirmAction");
    private final By successMessage = By.className("Vue-Toastification__toast--success");
    private final By leaveTypeDropdown = By.className("c-dd");
    private final By leaveType = By.id("dd-item-6571");

    public RequestLeavesPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    private String getCurrentDateWithDay(int dayOfMonth) {
        LocalDate date = LocalDate.now().withDayOfMonth(dayOfMonth);
        return date.toString();
    }

    public RequestLeavesPage requestAnnualLeave() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(startDate).click();
        helper.findElement(endDate).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(requestLeaveButton).click();
        helper.findElement(confirmationButton).click();
        helper.findElement(successMessage).isDisplayed();
        return this;
    }

    public RequestLeavesPage requestSickLeave()

    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(leaveTypeDropdown).click();
        helper.findElement(leaveType).click();
        helper.findElement(startDate).click();
        helper.findElement(endDate).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(requestLeaveButton).click();
        helper.findElement(confirmationButton).click();
        helper.findElement(successMessage).isDisplayed();
        return this;
    }
}
