package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.ViewCategoryProducts.ViewCategoryProducts;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCF018_ViewCategoryProducts extends BaseTest {

    @Test
    public void TCF018_ViewCategoryProducts() {
        LandingPage lp = new LandingPage(driver);
        ViewCategoryProducts vcp = new ViewCategoryProducts(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on Home Page button
        lp.getHomeButton().click();
        sleepTime(1000);

        // Verify that categories are visible on left side Bar
        if (vcp.getCategory().isDisplayed()) {
            String Category = vcp.getCategory().getText();
            Assert.assertTrue(true, Category);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click on 'Women' category
        vcp.getClickonWomen().click();

        // Click on any category link under 'Women' category, for example: Dress
        vcp.getDressForWomen().click();

        //  Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'

        if (vcp.getTextCenter_W().isDisplayed()) {
            String top_Product = vcp.getTextCenter_W().getText();
            Assert.assertTrue(true, top_Product);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // On left side Bar, click on any sub-category link of 'Men' category
        vcp.getClickOnMen().click();
        vcp.getMensT_Shirt().click();


        //8. Verify that user is navigated to that category page

        if (vcp.getTextCenter_M().isDisplayed()) {
            String top_Product = vcp.getTextCenter_M().getText();
            Assert.assertTrue(true, top_Product);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }



    }




}
