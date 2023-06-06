package com.internet.automation_exercise.pages.TestCases_Page;

import com.internet.automation_exercise.pom.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage {

    public TestCasesPage(WebDriver driver) {
        super(driver);

    }

    //Header
    @FindBy(css = "#form > div > div.row > div > h2 > b")
    public WebElement testCasesText;
    public WebElement getTestCasesText() {
        return testCasesText;
    }

    //Test Steps scenario
    @FindBy(css = "#form > div > div:nth-child(2) > h5 > span")
    public WebElement testStepsText;
    public WebElement getTestStepsText() {
        return testStepsText;
    }

    //Test case 1
    @FindBy(css = "#form > div > div:nth-child(2) > div > div.panel-heading > h4 > a > u")
    public WebElement testcase_1;
    public WebElement getTestcase_1() {
        return testcase_1;
    }

    //Test case 2
    @FindBy(css = "#form > div > div:nth-child(3) > div > div.panel-heading > h4 > a > u")
    public WebElement testcase_2;
    public WebElement getTestcase_2() {
        return testcase_2;
    }



}
