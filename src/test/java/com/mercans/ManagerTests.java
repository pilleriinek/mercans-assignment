package com.mercans;

import com.mercans.pages.LoginPage;
import org.testng.annotations.Test;

public class ManagerTests extends BaseTest {

    @Test
    public void loginTest() {
        new LoginPage(driver)
                .navigateToUrl("https://acceptance.mgthost.com")
                .enterEmail("demo+SH-00009@mercans.com")
                .enterPassword("Manager1!")
                .login();
    }

    @Test
    public void requestSickLeaveTest() {

    }
    @Test
    public void acceptAnnualLeaveTest() {

    }

   }
