package com.mercans.pages;

import com.mercans.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApprovalsPage {
    private WebDriver driver;
    private SeleniumHelper helper;
    private final By submittedText = By.linkText("Submitted");
    //private final By statusText = By.xpath(".//*[@id='mercansTable-26']//td[contains(.,'Pending')]");
    private final By statusText = By.xpath("(//tr)[2]");

    public ApprovalsPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new SeleniumHelper(driver);
    }
    public ApprovePendingPage submittedPendingLeave() {
        helper.findElement(submittedText).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        helper.findElement(statusText).click();

        return new ApprovePendingPage(driver);
    }


}
