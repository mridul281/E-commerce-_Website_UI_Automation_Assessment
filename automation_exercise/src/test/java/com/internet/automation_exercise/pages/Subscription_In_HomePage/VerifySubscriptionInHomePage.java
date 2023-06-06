package com.internet.automation_exercise.pages.Subscription_In_HomePage;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifySubscriptionInHomePage extends BasePage {

    public VerifySubscriptionInHomePage(WebDriver driver) {
        super(driver);
    }

    //Subscription Text
    @FindBy(css = "#footer > div.footer-widget > div > div > div.col-sm-3.col-sm-offset-1 > div > h2")
    public WebElement SubscriptionText;
    public WebElement getSubscriptionText() {
        return SubscriptionText;
    }

    //Input Subscribe email
    @FindBy(css = "#susbscribe_email")
    public WebElement inputSubscribeEmail;
    public WebElement getInputSubscribeEmail() {
        return inputSubscribeEmail;
    }

    // Submit Button
    @FindBy(css = "#subscribe")
    public WebElement submit_Subscribe_Button;
    public WebElement getSubmit_Subscribe_Button() {
        return submit_Subscribe_Button;
    }

    //success subscribe message
    @FindBy(css = "#success-subscribe")
    public WebElement successSubscribeMessege;
    public WebElement getSuccessSubscribeMessege() {
        return successSubscribeMessege;
    }









}
