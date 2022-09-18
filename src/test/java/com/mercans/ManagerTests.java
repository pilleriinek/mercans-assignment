package com.mercans;

import com.mercans.pages.LoginPage;
import org.junit.jupiter.api.Test;

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
        new LoginPage(driver)
                .navigateToUrl("https://acceptance.mgthost.com")
                .enterEmail("demo+SH-00009@mercans.com")
                .enterPassword("Manager1!")
                .login()
                .openMyLeaves()
                .requestNewLeave()
                .requestSickLeave();

    }
    @Test
    public void acceptAnnualLeaveTest() {
        new LoginPage(driver)
                .navigateToUrl("https://acceptance.mgthost.com")
                .enterEmail("demo+SH-00009@mercans.com")
                .enterPassword("Manager1!")
                .login()
                .openApprovals()
                .submittedPendingLeave()
                .approvePendingLeave();

    }

   }
