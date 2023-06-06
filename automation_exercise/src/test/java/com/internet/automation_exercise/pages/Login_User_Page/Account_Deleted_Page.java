package com.internet.automation_exercise.pages.Login_User_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Deleted_Page extends BasePage {

    public Account_Deleted_Page(WebDriver driver) {
        super(driver);
    }

    //Account Deleted
    @FindBy(css = "#form > div > div > div > h2 > b")
    public WebElement accountDeleted;
    public WebElement getAccountDeleted(){
        return accountDeleted;
    }

    /*

    //Paragraph 1
    @FindBy(css = "#form > div > div > div > p:nth-child(2)")
    public WebElement accountDeleted_p1;
    public WebElement getAccountDeleted_p1() {
        return accountDeleted_p1;
    }

    //Paragraph 2
    @FindBy(css = "#form > div > div > div > p:nth-child(3)")
    public WebElement accountDeleted_p2;
    public WebElement getAccountDeleted_p2() {
        return accountDeleted_p2;
    }

     */

    //Continue Button
    @FindBy(css = "#form > div > div > div > div > a")
    public WebElement ClickOn_D_ContinueButton;
    public WebElement getClickOn_D_ContinueButton() {
        return ClickOn_D_ContinueButton;
    }


}
