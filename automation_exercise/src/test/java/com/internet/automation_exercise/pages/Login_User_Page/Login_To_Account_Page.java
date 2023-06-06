package com.internet.automation_exercise.pages.Login_User_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_To_Account_Page extends BasePage {

    public Login_To_Account_Page(WebDriver driver) {
        super(driver);
    }

    // Login To Account Title
    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")
    public WebElement LoginToAccountText;
    public WebElement getLoginToAccountText() {
        return LoginToAccountText;
    }


    //Input Email Address
    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)")
    public WebElement InputLoginEmailAddress;
    public WebElement getInputLoginEmailAddress(){
        return InputLoginEmailAddress;
    }

    //Input Password
    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)")
    public WebElement InputLoginPassword;
    public WebElement getInputLoginPassword(){
        return InputLoginPassword;
    }

    //Click on Login Button
    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")
    public WebElement ClickOnLoginButton;
    public WebElement getClickOnLoginButton() {
        return ClickOnLoginButton;
    }

    //Incorrect Email and Password
    @FindBy (css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p")
    public WebElement incorrectmessagetext;
    public WebElement getIncorrectmessagetext() {
        return incorrectmessagetext;
    }



}
