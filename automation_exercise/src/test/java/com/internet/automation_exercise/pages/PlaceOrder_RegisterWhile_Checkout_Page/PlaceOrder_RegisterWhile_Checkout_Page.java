package com.internet.automation_exercise.pages.PlaceOrder_RegisterWhile_Checkout_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrder_RegisterWhile_Checkout_Page extends BasePage {


    public PlaceOrder_RegisterWhile_Checkout_Page(WebDriver driver) {
        super(driver);
    }

    //Add to Cart
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.productinfo.text-center > a")
    public WebElement addToCartButton;
    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    //View Cart
    @FindBy(css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement viewCartButton;
    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    // product id
    @FindBy(id = "#product-1")
    public WebElement product_id;
    public WebElement getProduct_id() {
        return product_id;
    }

    // click on proceed to checkout
    @FindBy(css = "#do_action > div.container > div > div > a")
    public WebElement clickonCheckout;
    public WebElement getClickonCheckout() {
        return clickonCheckout;
    }

    // Register / Login account to proceed on checkout
    @FindBy(css = "#checkoutModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement register_LoginButton;
    public WebElement getRegister_LoginButton() {
        return register_LoginButton;
    }
    //Input Name
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)")
    public WebElement InputName;
    public WebElement getInputName(){
        return InputName;
    }

    //Input Email Address
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")
    public WebElement InputEmailAddress;
    public WebElement getInputEmailAddress(){
        return InputEmailAddress;
    }

    //Click on Singup Button
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > button")
    public WebElement ClickOnSignUpButton;
    public WebElement getClickOnSignUpButton() {
        return ClickOnSignUpButton;
    }

    //Heading 1
    @FindBy(css = "#cart_items > div > div:nth-child(2) > h2")
    public WebElement headingText_1;
    public WebElement getHeadingText_1() {
        return headingText_1;
    }

    //Heading 2
    @FindBy(css = "#cart_items > div > div:nth-child(4) > h2")
    public WebElement headingText_2;
    public WebElement getHeadingText_2() {
        return headingText_2;
    }

    //Text Area
    @FindBy(css = "#ordermsg > textarea")
    public WebElement testArea;
    public WebElement getTestArea() {
        return testArea;
    }

    //Click on place order
    @FindBy(css = "#cart_items > div > div:nth-child(7) > a")
    public WebElement clickOnPlaceOrder;
    public WebElement getClickOnPlaceOrder() {
        return clickOnPlaceOrder;
    }

    //Payment Text
    @FindBy(css = "#cart_items > div > div.step-one > h2")
    public WebElement payment_Text;
    public WebElement getPayment_Text() {
        return payment_Text;
    }

    //Input name on card
    @FindBy(css = "#payment-form > div:nth-child(2) > div > input")
    public WebElement input_NameOn_Card;
    public WebElement getInput_NameOn_Card() {
        return input_NameOn_Card;
    }

    //Card Number
    @FindBy(css = "#payment-form > div:nth-child(3) > div > input")
    public WebElement input_CardNumber;
    public WebElement getInput_CardNumber() {
        return input_CardNumber;
    }

    //CVC
    @FindBy(css = "#payment-form > div:nth-child(4) > div.col-sm-4.form-group.cvc > input")
    public WebElement input_CVC;
    public WebElement getInput_CVC() {
        return input_CVC;
    }

    //Expiration month
    @FindBy(css = "#payment-form > div:nth-child(4) > div:nth-child(2) > input")
    public WebElement expirationMonth;
    public WebElement getExpirationMonth() {
        return expirationMonth;
    }

    //Expiration year
    @FindBy(css = "#payment-form > div:nth-child(4) > div:nth-child(3) > input")
    public WebElement expirationYear;
    public WebElement getExpirationYear() {
        return expirationYear;
    }

    //Pay and Confirm Order
    @FindBy(css = "#submit")
    public WebElement confirmOrder_Submit;
    public WebElement getConfirmOrder_Submit() {
        return confirmOrder_Submit;
    }

    //Order Placed Congratulation Message
    @FindBy(css = "#form > div > div > div > p")
    public WebElement congratulation_Message;
    public WebElement getCongratulation_Message() {
        return congratulation_Message;
    }















}
