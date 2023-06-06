package com.internet.automation_exercise.pages.Search_Product_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct_Page extends BasePage {

    public SearchProduct_Page(WebDriver driver) {
        super(driver);
    }


    //Search Product Text
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
    public WebElement searchProductText;
    public WebElement getSearchProductText() {
        return searchProductText;
    }

    //Search Product
    @FindBy(css = "#search_product")
    public WebElement searchProduct;
    public WebElement getSearchProduct() {
        return searchProduct;
    }

    //Submit Search Option
    @FindBy(css = "#submit_search")
    public WebElement submitSearch;
    public WebElement getSubmitSearch() {
        return submitSearch;
    }
    //Feature Items
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div")
    public WebElement feature_Item;
    public WebElement getFeature_Item() {
        return feature_Item;
    }
    //Product Info
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div.col-sm-4 > div > div.single-products > div.productinfo.text-center > p")
    public WebElement productInfo;
    public WebElement getProductInfo() {
        return productInfo;
    }
    //Click on View Product
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div.col-sm-4 > div > div.choose > ul > li > a")
    public WebElement clickOnViewProduct;
    public WebElement getClickOnViewProduct() {
        return clickOnViewProduct;
    }







}
