package com.mercans;

import com.mercans.runner.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new WebDriverRunner().createWebDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver.toString() != null) {
           driver.close();
        }
    }
}
