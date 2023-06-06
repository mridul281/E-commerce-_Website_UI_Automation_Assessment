package com.internet.automation_exercise.landingPage;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    // Home Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")
    public WebElement homeButton;
    public WebElement getHomeButton() {
        return homeButton;
    }

    //Product Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
    public WebElement productButton;
    public WebElement getProductButton() {
        return productButton;
    }

    //Cart Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a")
    public WebElement cartButton;
    public WebElement getCartButton() {
        return cartButton;
    }

    //SignUp_Login Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    public WebElement SignUp_LoginButton;
    public WebElement getSignUp_LoginButton(){
        return SignUp_LoginButton;

    }

    //Logout Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    public WebElement logout_Button;
    public WebElement getLogout_Button () {
        return logout_Button;
    }


    // logged in as Username
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a")
    public WebElement LoggedInAsUserName;
    public WebElement getLoggedInAsUserName(){
        return LoggedInAsUserName;
    }

    //click on delete account button
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement ClickOnDeleteAccountButton;
    public WebElement getClickOnDeleteAccountButton(){
        return ClickOnDeleteAccountButton;
    }

    @FindBy(css = "li:nth-of-type(8) > a")
    public WebElement ContactUsButton;
    public WebElement getContactUsButton(){
        return ContactUsButton;
    }


    //Test Cases
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(6) > a")
    public WebElement clickonTestCasesButton;
    public WebElement getClickonTestCasesButton() {
        return clickonTestCasesButton;
    }





}
