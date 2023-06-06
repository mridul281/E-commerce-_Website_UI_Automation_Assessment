package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Login_User_Page.Account_Deleted_Page;
import com.internet.automation_exercise.pages.Login_User_Page.Login_To_Account_Page;

import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF002_LoginUserCorrectEmailandpassword extends BaseTest {

    @Test
    public void TCF002_loginUserCorrectEmailandpassword () {
        LandingPage lp = new LandingPage(driver);
        Login_To_Account_Page ltp = new Login_To_Account_Page(driver);
        Account_Deleted_Page adp = new Account_Deleted_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on 'Signup / Login' button
        lp.getSignUp_LoginButton().click();
        sleepTime(1000);

        // Verify 'Login to your account' is visible
        if (ltp.getLoginToAccountText().isDisplayed()) {
            String LoginToAccountText = ltp.getLoginToAccountText().getText();
            Assert.assertTrue(true, LoginToAccountText);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter correct email address and password
        ltp.getInputLoginEmailAddress().sendKeys(testDataFiles.INPUT_EMAIL);

        ltp.getInputLoginPassword().sendKeys(testDataFiles.INPUT_PASSWORD);

        // Click 'login' button
        ltp.getClickOnLoginButton().click();
        sleepTime(1000);

        // Verify that 'Logged in as username' is visible
        if (lp.getLoggedInAsUserName().isDisplayed()) {
            String LoggedInAsUserName = lp.getLoggedInAsUserName().getText();
            Assert.assertTrue(true, LoggedInAsUserName);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Delete Account' button
        lp.getClickOnDeleteAccountButton().click();

        // Verify that 'ACCOUNT DELETED!' is visible
        if (adp.getAccountDeleted().isDisplayed()) {
            String getAccountDeleted = adp.getAccountDeleted().getText();
            Assert.assertTrue(true, getAccountDeleted);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click on account delete continue button
        adp.getClickOn_D_ContinueButton().click();
        sleepTime(1000);


        //driver.back();
        driver.navigate().back();
        sleepTime(1000);

















    }
}
