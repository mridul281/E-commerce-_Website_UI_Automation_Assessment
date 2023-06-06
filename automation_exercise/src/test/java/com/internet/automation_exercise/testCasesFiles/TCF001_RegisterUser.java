package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Login_User_Page.Account_Deleted_Page;
import com.internet.automation_exercise.pages.Register_User_Page.Account_Created_Page;
import com.internet.automation_exercise.pages.Register_User_Page.EnterAccountInformation_Page;
import com.internet.automation_exercise.pages.Register_User_Page.SignUp_LoginPage;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF001_RegisterUser extends BaseTest {

    @Test
    public void TCF001_registerUser () {
        LandingPage lp = new LandingPage(driver);
        SignUp_LoginPage slp = new SignUp_LoginPage(driver);
        EnterAccountInformation_Page eaip = new EnterAccountInformation_Page(driver);
        Account_Created_Page acp = new Account_Created_Page(driver);
        Account_Deleted_Page adp = new Account_Deleted_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on 'Signup / Login' button
        lp.getSignUp_LoginButton().click();
        sleepTime(1000);


        //Verify 'New User Signup!' is visible
        if (slp.getNewUserSignUpText().isDisplayed())
        {
            String newUserSignupText= slp.getNewUserSignUpText().getText();
            Assert.assertTrue(true,newUserSignupText);
        }
        else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }


        // Enter name and email address
        slp.getInputName().sendKeys(testDataFiles.NAME);

        slp.getInputEmailAddress().sendKeys(testDataFiles.EMAIL);

        // Click 'Signup' button
        slp.getClickOnSignUpButton().click();

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (eaip.getEnterAccountInformationHeader().isDisplayed())
        {
            String enterAccountInformationText= eaip.getEnterAccountInformationHeader().getText();
            Assert.assertTrue(true,enterAccountInformationText);
        }
        else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }



        // Fill details: Title, Name, Email, Password, Date of birth

        if (eaip.getTitleGenderBox1().isDisplayed())
        {
            String titleGenderBox1= eaip.getTitleGenderBox1().getText();
            Assert.assertTrue(true,titleGenderBox1);
        }
        else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");

        //click on Gender box
        eaip.getTitleGenderBox1().click();
        sleepTime(1000);
        //eaip.getTitleGenderBox2().click();
        //sleepTime(1000);

        // input Password
        eaip.getInputPassword().sendKeys(testDataFiles.INPUT_PASSWORD);

        //Select Birth date

        eaip.getSelectDay().sendKeys(testDataFiles.SELECT_DAY);
        eaip.getSelectMonth().sendKeys(testDataFiles.SELECT_MONTH);
        eaip.getSelectYear().sendKeys(testDataFiles.SELECT_YEAR);
        sleepTime(2000);


        //10. Select checkbox Sign up for our newsletter!
        eaip.getSignup_NewsLetterCheckBox().click();
        sleepTime(1000);
        // 11. Select checkbox 'Receive special offers from our partners!'
        eaip.getReceiveSpecialOfferCheckBox().click();
        sleepTime(1000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");


        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        eaip.getFirstName().sendKeys(testDataFiles.FIRST_NAME);
        eaip.getLastName().sendKeys(testDataFiles.LAST_NAME);
        eaip.getInputCompany().sendKeys(testDataFiles.COMPANY_NAME);
        eaip.getInputAddress1().sendKeys(testDataFiles.ADDRESS_1);
        eaip.getInputAddress2().sendKeys(testDataFiles.ADDRESS_2);
        eaip.getSelectCountry().sendKeys(testDataFiles.COUNTRY.toUpperCase());
        eaip.getInputState().sendKeys(testDataFiles.STATE);
        eaip.getInputCity().sendKeys(testDataFiles.CITY);
        eaip.getInputZipCode().sendKeys(testDataFiles.ZIP_CODE);
        eaip.getInputMobileNumber().sendKeys(testDataFiles.MOBILE_NUMBER);
        sleepTime(3000);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,500)");

        //13. Click 'Create Account button'
        eaip.getClickOnCreateAccountButton().click();
        sleepTime(2000);

        //14. Verify that 'ACCOUNT CREATED!' is visible

        if (acp.getAccountCreated().isDisplayed()) {
            String AccountCreateText = acp.getAccountCreated().getText();
            Assert.assertTrue(true,AccountCreateText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        //15. Click 'Continue' button
        acp.getClickOnContinueButton().click();
        sleepTime(2000);

        // Verify that 'Logged in as username' is visible
        if (lp.getLoggedInAsUserName().isDisplayed())
        {
            String actualLoggedUserName = lp.getLoggedInAsUserName().getText();
            Assert.assertTrue(true,actualLoggedUserName);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Delete Account' button
        lp.getClickOnDeleteAccountButton().click();
        sleepTime(1000);

        // Verify that 'ACCOUNT DELETED!' is visible
        if (adp.getAccountDeleted().isDisplayed())
        {
            String AccountDeleteText = adp.getAccountDeleted().getText();
            Assert.assertTrue(true,AccountDeleteText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // click 'Continue' button
        adp.getClickOn_D_ContinueButton().click();
        sleepTime(1000);


        // Driver Close
        driver.close();






    }





}







