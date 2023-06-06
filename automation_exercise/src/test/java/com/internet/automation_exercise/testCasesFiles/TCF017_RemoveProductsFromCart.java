package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;

import com.internet.automation_exercise.pages.RemoveProductsFromCart_Page.RemoveProductsFromCart_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TCF017_RemoveProductsFromCart extends BaseTest {


    @Test
    public void TCF017_removeProductsFromCart() {
        LandingPage lp = new LandingPage(driver);
        RemoveProductsFromCart_Page rcp = new RemoveProductsFromCart_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        //Add products to cart
        rcp.getAddToCartButton().click();
        sleepTime(1000);

        rcp.getContinueShopping_Button().click();

        // Click 'Cart' button
        lp.getCartButton().click();
        sleepTime(1000);

        //6. Verify that cart page is displayed
        if (rcp.getShoppingCart().isDisplayed()) {
            String ShoppingCartText = rcp.getShoppingCart().getText();
            Assert.assertTrue(true, ShoppingCartText);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'X' button corresponding to particular product
        rcp.getClick_X_Button().click();

        // Verify that product is removed from the cart

        sleepTime(1000);

        if (rcp.getEmpty_Cart().isDisplayed()) {
            String VerifyEmptyCart = rcp.getEmpty_Cart().getText();
            Assert.assertTrue(true, VerifyEmptyCart);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

    }

}



