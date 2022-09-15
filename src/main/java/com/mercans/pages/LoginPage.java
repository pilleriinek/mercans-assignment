package com.mercans.pages;


import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    SeleniumHelper helper;
    private final By emailField = By.name("email");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }

    public LoginPage navigateToUrl(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterEmail(String email) {
        helper.findElement(emailField).sendKeys(email);
        return this;
    }



}
