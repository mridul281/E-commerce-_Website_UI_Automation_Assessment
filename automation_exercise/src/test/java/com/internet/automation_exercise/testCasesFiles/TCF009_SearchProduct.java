package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.Search_Product_Page.SearchProduct_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TCF009_SearchProduct extends BaseTest {

    @Test
    public void TCF009_searchProduct () {
        LandingPage lp = new LandingPage(driver);
        SearchProduct_Page spp = new SearchProduct_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Product' button
        lp.getProductButton().click();
        sleepTime(1000);

        // Verify Search Product Text
        if (spp.getSearchProductText().isDisplayed())
        {
            String SearchProductText = spp.getSearchProductText().getText();
            Assert.assertTrue(true,SearchProductText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter product name in search input and click search button
        spp.getSearchProduct().sendKeys(testDataFiles.SEARCH_PRODUCT);
        sleepTime(1000);
        spp.getSubmitSearch().click();
        sleepTime(1000);

        // Verify 'SEARCHED PRODUCTS' is visible
        if (spp.getFeature_Item().isDisplayed())
        {
            String FeatureItem = spp.getFeature_Item().getText();
            Assert.assertTrue(true,FeatureItem);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify all the products related to search are visible
        //  Product Info
        if (spp.getProductInfo().isDisplayed())
        {
            String ProductInfo = spp.getProductInfo().getText();
            Assert.assertTrue(true,ProductInfo);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click on 'View Product' of first product
        spp.getClickOnViewProduct().click();
        sleepTime(1000);

        //diver.back
        driver.navigate().back();
        sleepTime(1000);












    }






}
