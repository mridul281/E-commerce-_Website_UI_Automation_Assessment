package com.internet.automation_exercise.pages.ContactUsForm_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsFromPage extends BasePage {


    public ContactUsFromPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > h2")
    public WebElement ContactUsTitle_Text;
    public WebElement getContactUsTitle_Text(){
        return ContactUsTitle_Text;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(2) > input")
    public WebElement InputName;
    public WebElement getInputName(){
        return InputName;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(3) > input")
    public WebElement InputEmail;
    public WebElement getInputEmail(){
        return InputEmail;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(4) > input")
    public WebElement InputSubject;
    public WebElement getInputSubject(){
        return InputSubject;
    }

    @FindBy(css = "#message")
    public WebElement CreateTextMassage;
    public WebElement getCreateTextMassage(){
        return CreateTextMassage;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(6) > input")
    public WebElement UploadFile;
    public WebElement getUploadFile(){
        return UploadFile;
    }

    @FindBy(css = ".submit_form")
    public WebElement ClickOnSubmitButton;
    public WebElement getClickOnSubmitButton(){
        return ClickOnSubmitButton;
    }

    @FindBy(css = ".alert.alert-success.status")
    public WebElement alertSuccessText;
    public WebElement getAlertSuccessText(){
        return alertSuccessText;
    }

    @FindBy(css = "#form-section > a > span")
    public WebElement clickonHomeButton;
    public WebElement getClickonHomeButton(){
        return clickonHomeButton;
    }







}
