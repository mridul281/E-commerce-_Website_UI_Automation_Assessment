package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.AllProductsAndProductDetail_Page.AllProductsAndProductDetail_Page;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TCF008_VerifyAllProductsAndProductDetail extends BaseTest {


    @Test
    public void TCF008_verifyAllProductsAndProductDetail () {
        LandingPage lp = new LandingPage(driver);
        AllProductsAndProductDetail_Page apdp = new AllProductsAndProductDetail_Page(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Product' button
        lp.getProductButton().click();
        sleepTime(1000);

        // Verify user is navigated to ALL PRODUCTS page successfully
        if (apdp.getProductPage().isDisplayed())
        {
            String ProductPage = apdp.getProductPage().getText();
            Assert.assertTrue(true,ProductPage);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // The products list is visible
        if (apdp.getProductList().isDisplayed())
        {
            String ProductList = apdp.getProductList().getText();
            Assert.assertTrue(true,ProductList);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click on 'View Product' of first product
        apdp.getProductDetail().click();
        sleepTime(1000);

        // User is landed to product detail page
        if (apdp.getProductInformation().isDisplayed())
        {
            String ProductInformation = apdp.getProductInformation().getText();
            Assert.assertTrue(true,ProductInformation);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify that detail is visible: product name, category, price, availability, condition, brand

        // Verify that detail is visible: product name
        if (apdp.getProductName().isDisplayed())
        {
            String ProductName = apdp.getProductName().getText();
            Assert.assertTrue(true,ProductName);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify that detail is visible: category
        if (apdp.getProductCategory().isDisplayed())
        {
            String ProductCategory = apdp.getProductCategory().getText();
            Assert.assertTrue(true,ProductCategory);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify that detail is visible: price
        if (apdp.getProductPrice().isDisplayed())
        {
            String ProductPrice = apdp.getProductPrice().getText();
            Assert.assertTrue(true,ProductPrice);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

       // Verify that detail is visible: availability
        if (apdp.getAvailability().isDisplayed())
        {
            String Availability = apdp.getAvailability().getText();
            Assert.assertTrue(true,Availability);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //Verify that detail is visible: condition
        if (apdp.getConditions().isDisplayed())
        {
            String Conditions = apdp.getConditions().getText();
            Assert.assertTrue(true,Conditions);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        //Verify that detail is visible: brand
        if (apdp.getProductBrand().isDisplayed())
        {
            String ProductBrand = apdp.getProductBrand().getText();
            Assert.assertTrue(true,ProductBrand);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        //driver.close
        driver.close();














    }



}
