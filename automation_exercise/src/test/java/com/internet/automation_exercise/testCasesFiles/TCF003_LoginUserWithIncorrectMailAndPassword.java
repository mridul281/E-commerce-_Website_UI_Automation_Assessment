package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Login_User_Page.Login_To_Account_Page;
import com.internet.automation_exercise.pom.BaseTest;

import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF003_LoginUserWithIncorrectMailAndPassword extends BaseTest {


    @Test
    public void TCF003_loginUserWithIncorrectMailAndPassword () {
        LandingPage lp = new LandingPage(driver);
        Login_To_Account_Page ltp = new Login_To_Account_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        //4. Click on 'Signup / Login' button
        lp.getSignUp_LoginButton().click();
        sleepTime(1000);

        //5. Verify 'Login to your account' is visible
        if (ltp.getLoginToAccountText().isDisplayed()) {
            String LoginToAccountText = ltp.getLoginToAccountText().getText();
            Assert.assertTrue(true, LoginToAccountText);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //6. Enter correct email address and password
        ltp.getInputLoginEmailAddress().sendKeys(testDataFiles.INPUT_INCORRECT_EMAIL);

        ltp.getInputLoginPassword().sendKeys(testDataFiles.INPUT_INCORRECT_PASSWORD);

        //7. Click 'login' button
        ltp.getClickOnLoginButton().click();
        sleepTime(1000);

        //incorrect Message Validation
        String incorectMassagetext = ltp.getIncorrectmessagetext().getText();
        System.out.println(incorectMassagetext);
        sleepTime(2000);


        //driver.close();
        driver.navigate().back();
        sleepTime(1000);

    }









}
