package com.internet.automation_exercise.pages.Subscription_In_CartPage;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verify_Subscription_In_CartPage extends BasePage {


    public Verify_Subscription_In_CartPage(WebDriver driver) {
        super(driver);
    }

    //Cart is empty Text
    @FindBy(css = "#empty_cart > p")
    public WebElement cartEmptyText;
    public WebElement getCartEmptyText() {
        return cartEmptyText;
    }

    //Click 'here'
    @FindBy(css = "#empty_cart > p > a > u")
    public WebElement click_here;
    public WebElement getClick_here() {
        return click_here;
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
