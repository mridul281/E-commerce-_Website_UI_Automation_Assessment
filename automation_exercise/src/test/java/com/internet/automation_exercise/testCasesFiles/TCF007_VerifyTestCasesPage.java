package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.TestCases_Page.TestCasesPage;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TCF007_VerifyTestCasesPage extends BaseTest {

    @Test
    public void TCF007_verifyTestCasesPage () {
        LandingPage lp = new LandingPage(driver);
        TestCasesPage tcp = new TestCasesPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Test Case Button' button
        lp.getClickonTestCasesButton().click();
        sleepTime(1000);

         // Verify user is navigated to test cases page successfully

        if (tcp.getTestCasesText().isDisplayed()) {
            String TestCasesText = tcp.getTestCasesText().getText();
            Assert.assertTrue(true,TestCasesText);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Test steps scenario Text
        if (tcp.getTestStepsText().isDisplayed()) {
            String TestStepsText = tcp.getTestStepsText().getText();
            Assert.assertTrue(true,TestStepsText);
        } else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        // Click on the scenario for detailed Test Steps Button:

        tcp.getTestcase_1().click();
        sleepTime(500);

        tcp.getTestcase_2().click();
        sleepTime(500);



        //Driver.close
        driver.navigate().back();
        sleepTime(1000);












    }


}
