package com.internet.automation_exercise.pages.VerifyProductQuantityInCart_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyProductQuantityinCart_Page extends BasePage {


    public VerifyProductQuantityinCart_Page(WebDriver driver) {
        super(driver);
    }

    //View Product Details
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div.product-image-wrapper > div.choose > ul > li > a")
    public WebElement productDetails;
    public WebElement getProductDetails() {
        return productDetails;
    }
    //Product Information
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div")
    public WebElement productInformationText;
    public WebElement getProductInformationText() {
        return productInformationText;
    }
    //Input Quantity
    @FindBy(css = "#quantity")
    public WebElement inputQuantity;
    public WebElement getInputQuantity() {
        return inputQuantity;
    }
    //Add to cart button
    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > button")
    public WebElement defaultCartButton;
    public WebElement getDefaultCartButton() {
        return defaultCartButton;
    }

    //View cart
    @FindBy(css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement viewCartButton;
    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    //Disabled Quantity
    @FindBy(css = "#product-2 > td.cart_quantity > button")
    public WebElement viewQuantity;
    public WebElement getViewQuantity() {
        return viewQuantity;
    }

    //Cart Delete Button
    @FindBy(css = "#product-2 > td.cart_delete > a > i")
    public WebElement cart_Delete;
    public WebElement getCart_Delete() {
        return cart_Delete;
    }





}
