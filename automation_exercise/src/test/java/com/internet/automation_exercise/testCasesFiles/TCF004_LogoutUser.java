package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.LogoutUser_Page.LogoutUser_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF004_LogoutUser extends BaseTest {

    @Test
    public void TCF004_logoutUser () {
        LandingPage lp = new LandingPage(driver);
        LogoutUser_Page lup = new LogoutUser_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        //4. Click on 'Signup / Login' button
        lp.getSignUp_LoginButton().click();
        sleepTime(1000);

        //5. Verify 'Login to your account' is visible
        if (lup.getLoginToAccountTitle().isDisplayed()) {
            String LoginToAccountTitle = lup.getLoginToAccountTitle().getText();
            Assert.assertTrue(true, LoginToAccountTitle);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //6. Enter correct email address and password
        lup.getInputLoginEmailAddress().sendKeys(testDataFiles.INPUT_EMAIL);

        lup.getInputLoginPassword().sendKeys(testDataFiles.INPUT_PASSWORD);

        //7. Click 'login' button
        lup.getClickOnLoginButton().click();
        sleepTime(1000);

        // 8. Log out
        lp.logout_Button.click();
        sleepTime(1000);

        //driver.back
        driver.navigate().back();




    }






}
