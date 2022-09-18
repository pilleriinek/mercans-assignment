package com.mercans;

import com.mercans.runner.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new WebDriverRunner().createWebDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver.toString() != null) {
           driver.close();
        }
    }
}
