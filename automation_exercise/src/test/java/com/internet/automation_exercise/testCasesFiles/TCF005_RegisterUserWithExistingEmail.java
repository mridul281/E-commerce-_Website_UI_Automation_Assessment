package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.RegisterUserWithExistingEmail_Page.RegisterUserWithExistingEmail_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF005_RegisterUserWithExistingEmail extends BaseTest {

    @Test
    public void TCF005_registerUserWithExistingEmail () {
        LandingPage lp = new LandingPage(driver);
        RegisterUserWithExistingEmail_Page ruep = new RegisterUserWithExistingEmail_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on 'Signup / Login' button
        lp.getSignUp_LoginButton().click();
        sleepTime(1000);

        //Verify 'New User Signup!' is visible
        if (ruep.getNewUserSignUpText().isDisplayed())
        {
            String newUserSignupText= ruep.getNewUserSignUpText().getText();
            Assert.assertTrue(true,newUserSignupText);
        }
        else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter name and email address
        ruep.getInputName().sendKeys(testDataFiles.NAME);

        ruep.getInputEmailAddress().sendKeys(testDataFiles.EMAIL);

        // Click 'Signup' button
        ruep.getClickOnSignUpButton().click();
        sleepTime(1000);

        // Verify error 'Email Address already exist!' is visible
        if (ruep.getAlreadyExistMessage().isDisplayed())
        {
            String AlreadyExistMessage= ruep.getAlreadyExistMessage().getText();
            Assert.assertTrue(true,AlreadyExistMessage);
        }
        else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // navigate.back
        driver.navigate().back();
        sleepTime(1000);




    }




}
