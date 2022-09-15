package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.WebDriver;

public class LeavesPage {
    private WebDriver driver;
    private SeleniumHelper helper;

    public LeavesPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }
}
