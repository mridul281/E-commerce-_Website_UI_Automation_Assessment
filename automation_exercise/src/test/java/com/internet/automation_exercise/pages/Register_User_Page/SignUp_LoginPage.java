package com.internet.automation_exercise.pages.Register_User_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_LoginPage extends BasePage {

    public SignUp_LoginPage(WebDriver driver) {
        super(driver);
    }
        //User Singup
        @FindBy(css = "#form > div > div > div:nth-child(3) > div > h2")
        public WebElement NewUserSignUpText;
        public WebElement getNewUserSignUpText(){
            return NewUserSignUpText;
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



    }
