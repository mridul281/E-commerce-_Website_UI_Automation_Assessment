package com.internet.automation_exercise.pages.RemoveProductsFromCart_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProductsFromCart_Page extends BasePage {

    public RemoveProductsFromCart_Page(WebDriver driver) {
        super(driver);
    }


    //Add to Cart
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > a")
    public WebElement addToCartButton;
    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    //Continue Shopping Button
    @FindBy(css = "#cartModal > div > div > div.modal-footer > button")
    public WebElement continueShopping_Button;
    public WebElement getContinueShopping_Button() {
        return continueShopping_Button;
    }

    //Cart Page, Shopping Cart
    @FindBy(css = "#cart_items > div > div.breadcrumbs > ol > li.active")
    public WebElement shoppingCart;
    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    //Click 'x' Button
    @FindBy(css = "#product-1 > td.cart_delete > a > i")
    public WebElement click_X_Button;
    public WebElement getClick_X_Button() {
        return click_X_Button;
    }

    //Cart is Empty
    @FindBy(css = "#empty_cart > p > b")
    public WebElement empty_Cart;
    public WebElement getEmpty_Cart() {
        return empty_Cart;
    }








}
