package com.internet.automation_exercise.pages.ViewCategoryProducts;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCategoryProducts extends BasePage {

    public ViewCategoryProducts(WebDriver driver) {
        super(driver);
    }


    //Category
    @FindBy(css = "body > section > div > div.row > div.col-sm-3 > div > h2")
    public WebElement category;
    public WebElement getCategory() {
        return category;
    }

    //Women
    @FindBy(css = "#accordian > div:nth-child(1) > div.panel-heading > h4")
    public WebElement clickonWomen;
    public WebElement getClickonWomen() {
        return clickonWomen;
    }

    //Dress For Women
    @FindBy(css = "#Women > div > ul > li:nth-child(1) > a")
    public WebElement dressForWomen;
    public WebElement getDressForWomen() {
        return dressForWomen;
    }

    //Text Center Women
    @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
    public WebElement textCenter_W;
    public WebElement getTextCenter_W() {
        return textCenter_W;
    }

    //Men
    @FindBy(css = "#accordian > div:nth-child(2) > div.panel-heading > h4")
    public WebElement clickOnMen;
    public WebElement getClickOnMen() {
        return clickOnMen;
    }

    // T-Shirt
    @FindBy(css = "#Men > div > ul > li:nth-child(1) > a")
    public WebElement mensT_Shirt;
    public WebElement getMensT_Shirt() {
        return mensT_Shirt;
    }

    //Text Center Men
    @FindBy(css = "body > section > div > div.row > div.col-sm-9.padding-right > div > h2")
    public WebElement textCenter_M;
    public WebElement getTextCenter_M() {
        return textCenter_M;
    }






}
