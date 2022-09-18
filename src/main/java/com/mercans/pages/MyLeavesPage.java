package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeavesPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By requestLeaveText = By.className("button-primary");
    public MyLeavesPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }
    public RequestLeavesPage requestNewLeave() {
        helper.findElement(requestLeaveText).click();
        return new RequestLeavesPage(driver);
    }
}
