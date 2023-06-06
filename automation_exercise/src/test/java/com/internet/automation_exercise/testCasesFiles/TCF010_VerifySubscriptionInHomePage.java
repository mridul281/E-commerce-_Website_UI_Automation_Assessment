package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Subscription_In_HomePage.VerifySubscriptionInHomePage;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF010_VerifySubscriptionInHomePage extends BaseTest {

    @Test
    public void TCF010_verifySubscriptionInHomePage () {
        LandingPage lp = new LandingPage(driver);
        VerifySubscriptionInHomePage vshp = new VerifySubscriptionInHomePage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Product' button
        lp.getHomeButton().click();
        sleepTime(1000);


        //4. Scroll down to footer
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lenOfPage = (Long) (js.executeScript("return document.body.scrollHeight"));
        boolean scrolled = true;
        long lastCount = 0;
        System.out.println(lenOfPage);

        while(scrolled==true) {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTime(2500);
            lastCount=lenOfPage;
            lenOfPage = (Long) (js.executeScript("return document.body.scrollHeight"));
            System.out.println(lenOfPage);
            if (lastCount==lenOfPage) {
                scrolled=false;
            }

            lastCount=lenOfPage;


            // Verify text 'SUBSCRIPTION'
            if (vshp.getSubscriptionText().isDisplayed())
            {
                String SubscriptionText = vshp.getSubscriptionText().getText();
                Assert.assertTrue(true,SubscriptionText);
            }else {
                System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
            }

            // Enter email address in input and click arrow button
            vshp.getInputSubscribeEmail().sendKeys(testDataFiles.INPUT_SUBSCRIBE_EMAIL);
            sleepTime(1000);

            //Click on Submit Button
            vshp.getSubmit_Subscribe_Button().click();
            sleepTime(1000);

            //Verify success message 'You have been successfully subscribed!' is visible
            if (vshp.getSuccessSubscribeMessege().isDisplayed())
            {
                String SuccessSubscribeMessege = vshp.getSuccessSubscribeMessege().getText();
                Assert.assertTrue(true,SuccessSubscribeMessege);
            }else {
                System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
            }

            // driver.nevigate
            driver.navigate().back();
            sleepTime(1000);





    }



    }



}
