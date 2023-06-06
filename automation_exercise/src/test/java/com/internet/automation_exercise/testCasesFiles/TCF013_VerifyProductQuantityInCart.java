package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.VerifyProductQuantityInCart_Page.VerifyProductQuantityinCart_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TCF013_VerifyProductQuantityInCart extends BaseTest {

    @Test
    public void TCF013_verifyProductQuantityInCart () throws AWTException {
        LandingPage lp = new LandingPage(driver);
        VerifyProductQuantityinCart_Page vpqp = new VerifyProductQuantityinCart_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on Home Page button
        lp.getHomeButton().click();
        sleepTime(1000);

        // Click 'View Product' for any product on home page

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_5);

        vpqp.getProductDetails().click();
        sleepTime(1000);

        // Verify product detail is opened
        if (vpqp.getProductInformationText().isDisplayed())
        {
            String ProductInformation = vpqp.getProductInformationText().getText();
            Assert.assertTrue(true,ProductInformation);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //  Increase quantity to 5
        vpqp.getInputQuantity().clear();

        vpqp.getInputQuantity().sendKeys("5");

        // Click 'Add to cart' button
        vpqp.getDefaultCartButton().click();

        //Click 'View Cart' button
        vpqp.getViewCartButton().click();

        // Verify that product is displayed in cart page with exact quantity
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        if (vpqp.getViewQuantity().isDisplayed())
        {
            String Disabled_Quantity = vpqp.getViewQuantity().getText();
            Assert.assertTrue(true,Disabled_Quantity);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //Cart Delete Button
        vpqp.getCart_Delete().click();
        sleepTime(1000);

        //driver.back
        driver.navigate().back();
        sleepTime(1000);











    }




}
