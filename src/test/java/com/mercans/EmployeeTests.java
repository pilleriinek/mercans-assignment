package com.mercans;

import com.mercans.pages.LoginPage;
import org.testng.annotations.Test;

public class EmployeeTests extends BaseTest {

    @Test
    public void loginTest() {
        new LoginPage(driver)
                .navigateToUrl("https://acceptance.mgthost.com")
                .enterEmail("demo+MR-00809@mercans.com")
                .enterPassword("Employee1!")
                .login();


    }

    @Test
    public void requestAnnualLeaveTest() {
        new LoginPage(driver)
                .navigateToUrl("https://acceptance.mgthost.com")
                .enterEmail("demo+MR-00809@mercans.com")
                .enterPassword("Employee1!")
                .login()
                .openMyLeaves()
                .requestNewLeave()
                .requestAnnualLeave();


    }

   }
