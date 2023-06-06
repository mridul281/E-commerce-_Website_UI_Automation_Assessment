package com.internet.automation_exercise.pages.AllProductsAndProductDetail_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsAndProductDetail_Page extends BasePage {

    public AllProductsAndProductDetail_Page(WebDriver driver) {
        super(driver);

    }

    //Product Page
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
    public WebElement productPage;
    public WebElement getProductPage() {
        return productPage;
    }

    //All products List
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div")
    public WebElement productList;
    public WebElement getProductList() {
        return productList;
    }

    //View Product Detail
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul > li > a")
    public WebElement productDetail;
    public WebElement getProductDetail() {
        return productDetail;
    }

    // Product Information
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div")
    public WebElement productInformation;
    public WebElement getProductInformation() {
        return productInformation;
    }

    //Product Name
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > h2")
    public WebElement productName;
    public WebElement getProductName() {
        return productName;
    }

    //Product Category
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(3)")
    public WebElement productCategory;
    public WebElement getProductCategory() {
        return productCategory;
    }

    //Product Price
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > span")
    public WebElement productPrice;
    public WebElement getProductPrice() {
        return productPrice;
    }

    //availability
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(6)")
    public WebElement availability;
    public WebElement getAvailability() {
        return availability;
    }
    //Conditions
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(7)")
    public WebElement conditions;
    public WebElement getConditions() {
        return conditions;
    }

    //Product Brand
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(8)")
    public WebElement productBrand;
    public WebElement getProductBrand() {
        return productBrand;
    }










}
