package com.internet.automation_exercise.testCasesFiles;

import com.internet.automation_exercise.landingPage.LandingPage;
import com.internet.automation_exercise.pages.ContactUsForm_Page.ContactUsFromPage;
import com.internet.automation_exercise.pom.BaseTest;
import com.internet.automation_exercise.utilities.testDataFiles;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TCF006_ContactUsForm extends BaseTest {

    @Test
    public void TCF006_contactUsForm () throws AWTException {
        LandingPage lp = new LandingPage(driver);
        ContactUsFromPage cufp = new ContactUsFromPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, testDataFiles.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Contact Us' button
        lp.getContactUsButton().click();
        sleepTime(1000);

        // Verify 'GET IN TOUCH' is visible
        if (cufp.getContactUsTitle_Text().isDisplayed())
        {
            String Title_Text = cufp.getContactUsTitle_Text().getText();
            Assert.assertTrue(true,Title_Text);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter name, email, subject and message
        cufp.getInputName().sendKeys(testDataFiles.INPUT_NAME);
        sleepTime(500);
        cufp.getInputEmail().sendKeys(testDataFiles.INPUT_EMAIL);
        sleepTime(500);
        cufp.getInputSubject().sendKeys(testDataFiles.INPUT_SUBJECT);
        sleepTime(500);
        cufp.getCreateTextMassage().sendKeys(testDataFiles.INPUT_MASSAGE);
        sleepTime(500);

        /*
        // Upload file
        cufp.getUploadFile().sendKeys(testDataFiles.UPLOAD_FILE_PATH);
        sleepTime(1000);

         */

        //Click 'Submit' button
        cufp.getClickOnSubmitButton().click();
        sleepTime(1000);



        //9. Click OK button
        //driver.switchTo().alert().accept();
        // sleepTime(2000);

        Robot robot = new Robot();
        StringSelection Uploadfilepath =new StringSelection(testDataFiles.UPLOAD_FILE_PATH);
        robot.keyPress(KeyEvent.VK_ENTER);

        //Now Press V
        robot.keyPress(KeyEvent.VK_V);
        sleepTime(2000);

        //Now Release V
        robot.keyRelease(KeyEvent.VK_V);
        sleepTime(2000);

        //Now Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTime(2000);

        //Now Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        sleepTime(2000);



        //Click 'Submit' button
        //cufp.getClickOnSubmitButton().click();
        //sleepTime(1000);

        // Verify success message 'Success! Your details have been submitted successfully.' is visible
        if (cufp.getAlertSuccessText().isDisplayed())
        {
            String AlertSuccessText = cufp.getAlertSuccessText().getText();
            Assert.assertTrue(true,AlertSuccessText);
        }else {
            System.out.println(testDataFiles.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Home' button and verify that landed to home page successfully
        cufp.getClickonHomeButton().click();
        sleepTime(1000);

        //Navigate Back to url
        driver.navigate().back();
        sleepTime(3000);










    }
}
