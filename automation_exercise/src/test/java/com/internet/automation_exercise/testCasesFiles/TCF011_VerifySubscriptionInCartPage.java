package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Subscription_In_CartPage.Verify_Subscription_In_CartPage;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TCF011_VerifySubscriptionInCartPage extends BaseTest {


    @Test
    public void TCF011_verifySubscriptionInCartPage () throws AWTException {
        LandingPage lp = new LandingPage(driver);
        Verify_Subscription_In_CartPage vscp = new Verify_Subscription_In_CartPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Cart' button
        lp.getCartButton().click();
        sleepTime(1000);

        //Cart is empty Text
        if (vscp.getCartEmptyText().isDisplayed())
        {
            String CartEmptyText = vscp.getCartEmptyText().getText();
            Assert.assertTrue(true,CartEmptyText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //Click 'here' to buy product
        vscp.getClick_here().click();
        driver.navigate().back();
        sleepTime(1000);


        //5. Scroll down to footer
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);

        // Verify text 'SUBSCRIPTION'
        if (vscp.getSubscriptionText().isDisplayed())
        {
            String SubscriptionText = vscp.getSubscriptionText().getText();
            Assert.assertTrue(true,SubscriptionText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter email address in input and click arrow button
        vscp.getInputSubscribeEmail().sendKeys(testDataFiles.INPUT_SUBSCRIBE_EMAIL);
        sleepTime(1000);

        //Click on Submit Button
        vscp.getSubmit_Subscribe_Button().click();
        sleepTime(1000);

        //Verify success message 'You have been successfully subscribed!' is visible
        if (vscp.getSuccessSubscribeMessege().isDisplayed())
        {
            String SuccessSubscribeMessege = vscp.getSuccessSubscribeMessege().getText();
            Assert.assertTrue(true,SuccessSubscribeMessege);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // driver.nevigate
        driver.navigate().back();
        sleepTime(1000);





    }


}
