package com.mercans.pages;


import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private SeleniumHelper helper;
    private final By emailField = By.name("email");
    private final By passwordField = By.name("password");
    private final By loginButton = By.className("button-action--save");

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

    public LoginPage enterPassword(String password) {
        helper.findElement(passwordField).sendKeys(password);
        return this;
    }

    public DashboardPage login() {
        helper.findElement(loginButton).click();
        return new DashboardPage(driver);
    }


}
