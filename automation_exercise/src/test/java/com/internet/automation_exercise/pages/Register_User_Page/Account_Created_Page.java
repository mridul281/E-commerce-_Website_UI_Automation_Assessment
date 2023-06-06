package com.internet.automation_exercise.pages.Register_User_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Created_Page extends BasePage {

    public Account_Created_Page(WebDriver driver) {
        super(driver);
    }

    //Account Created
    @FindBy(css = "#form > div > div > div > h2 > b")
    public WebElement accountCreated;
    public WebElement getAccountCreated(){
        return accountCreated;
    }

    /*

    //Paragraph 1
    @FindBy(css = "#form > div > div > div > p:nth-child(2)")
    public WebElement accountCreated_p1;
    public WebElement getAccountCreated_p1() {
        return accountCreated_p1;
    }

    //Paragraph 2
    @FindBy(css = "#form > div > div > div > p:nth-child(3)")
    public WebElement accountCreated_p2;
    public WebElement getAccountCreated_p2() {
        return accountCreated_p2;
    }

     */

    //Continue Button
    @FindBy(css = "#form > div > div > div > div > a")
    public WebElement ClickOnContinueButton;
    public WebElement getClickOnContinueButton(){
        return ClickOnContinueButton;
    }



}
