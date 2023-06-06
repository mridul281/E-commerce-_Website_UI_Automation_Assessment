package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Login_User_Page.Account_Deleted_Page;
import com.internet.automation_exercise.pages.PlaceOrder_RegisterWhile_Checkout_Page.PlaceOrder_RegisterWhile_Checkout_Page;
import com.internet.automation_exercise.pages.Register_User_Page.Account_Created_Page;
import com.internet.automation_exercise.pages.Register_User_Page.EnterAccountInformation_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF014_PlaceOrder_RegisterWhile_Checkout extends BaseTest {

    @Test
    public void TCF014_placeOrder_RegisterWhile_Checkout () {
        LandingPage lp = new LandingPage(driver);
        PlaceOrder_RegisterWhile_Checkout_Page prcp = new PlaceOrder_RegisterWhile_Checkout_Page(driver);
        EnterAccountInformation_Page eaip = new EnterAccountInformation_Page(driver);
        Account_Created_Page acp = new Account_Created_Page(driver);
        Account_Deleted_Page adp = new Account_Deleted_Page(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        /*
        // Click on 'Home Page' button
        lp.getHomeButton().click();
        sleepTime(1000);

         */


        //4. Add products to cart
        prcp.getAddToCartButton().click();
        sleepTime(1000);

        //5. Click 'Cart' button
        prcp.getViewCartButton().click();
        sleepTime(1000);

        /*

        //6. Verify that cart page is displayed

        if (prcp.getProduct_id().isDisplayed())
        {
            String Product_id = prcp.getProduct_id().getText();
            Assert.assertTrue(true,Product_id);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

         */

        //7. Click Proceed To Checkout
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");

        prcp.getClickonCheckout().click();
        sleepTime(1000);

        //8. Click 'Register / Login' button
        prcp.getRegister_LoginButton().click();
        sleepTime(1000);

        //9. Fill all details in Signup and create account

        // Enter name and email address
        prcp.getInputName().sendKeys(testDataFiles.NAME);

        prcp.getInputEmailAddress().sendKeys(testDataFiles.EMAIL);

        // Click 'Signup' button
        prcp.getClickOnSignUpButton().click();

        // Fill details: Title, Name, Email, Password, Date of birth

        //click on Gender box
        eaip.getTitleGenderBox1().click();
        sleepTime(1000);

        // input Password
        eaip.getInputPassword().sendKeys(testDataFiles.INPUT_PASSWORD);

        // Select Birth date

        eaip.getSelectDay().sendKeys(testDataFiles.SELECT_DAY);
        eaip.getSelectMonth().sendKeys(testDataFiles.SELECT_MONTH);
        eaip.getSelectYear().sendKeys(testDataFiles.SELECT_YEAR);
        sleepTime(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");

        // Select checkbox Sign up for our newsletter!
        eaip.getSignup_NewsLetterCheckBox().click();
        sleepTime(1000);
        // Select checkbox 'Receive special offers from our partners!'
        eaip.getReceiveSpecialOfferCheckBox().click();
        sleepTime(1000);


        // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number


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
        sleepTime(2000);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,500)");

        // Click 'Create Account button'
        eaip.getClickOnCreateAccountButton().click();
        sleepTime(2000);

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button

        if (acp.getAccountCreated().isDisplayed()) {
            String AccountCreateText = acp.getAccountCreated().getText();
            Assert.assertTrue(true,AccountCreateText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        // Click 'Continue' button
        acp.getClickOnContinueButton().click();
        sleepTime(2000);


        //11. Verify ' Logged in as username' at top
        if (lp.getLoggedInAsUserName().isDisplayed())
        {
            String actualLoggedUserName = lp.getLoggedInAsUserName().getText();
            Assert.assertTrue(true,actualLoggedUserName);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //12.Click 'Cart' button
        lp.getCartButton().click();
        sleepTime(2000);

        //13. Click 'Proceed To Checkout' button
        prcp.getClickonCheckout().click();
        sleepTime(1000);

        //14. Verify Address Details and Review Your Order
        if (prcp.getHeadingText_1().isDisplayed())
        {
            String headingText_1 = prcp.getHeadingText_1().getText();
            Assert.assertTrue(true,headingText_1);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //heading 2

        if (prcp.getHeadingText_2().isDisplayed())
        {
            String headingText_2 = prcp.getHeadingText_2().getText();
            Assert.assertTrue(true,headingText_2);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //15. Enter description in comment text area and click 'Place Order'
        prcp.getTestArea().sendKeys(testDataFiles.TEXT_AREA_MESSAGE);
        prcp.getClickOnPlaceOrder().click();
        sleepTime(2000);

        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        if (prcp.getPayment_Text().isDisplayed())
        {
            String Payment_Text = prcp.getPayment_Text().getText();
            Assert.assertTrue(true,Payment_Text);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);

        prcp.getInput_NameOn_Card().sendKeys(testDataFiles.NAME_ON_CARD);
        prcp.getInput_CardNumber().sendKeys(testDataFiles.CARD_NUMBER);
        prcp.getInput_CVC().sendKeys(testDataFiles.CVC);
        prcp.getExpirationMonth().sendKeys(testDataFiles.EXPIRATION_MM);
        prcp.getExpirationYear().sendKeys(testDataFiles.EXPIRATION_YYYY);


        //17. Click 'Pay and Confirm Order' button
        prcp.getConfirmOrder_Submit().click();
        sleepTime(2000);


        //18. Verify success message 'Your order has been placed successfully!'
        if (prcp.getCongratulation_Message().isDisplayed())
        {
            String Congratulation_Message = prcp.getCongratulation_Message().getText();
            Assert.assertTrue(true,Congratulation_Message);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }


        //19. Click 'Delete Account' button
        lp.getClickOnDeleteAccountButton().click();
        sleepTime(1000);

        //20. Verify 'ACCOUNT DELETED!' a
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













    }












}
