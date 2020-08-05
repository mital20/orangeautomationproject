package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {
    // created all reusable methods
    public static void sleep1(int n) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitUntilElementIsClickable(String by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(by)));
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typetext(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void selectByVisbleTextFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByIndex(By by, int n) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n);
    }

    public static void selectfromDropDownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static void asserttextmessage(String actucl, String expected, String message) {

        Assert.assertEquals(actucl, expected, "");// comparing two texts
    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static void takeScreenShot(String fileName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File("src\\main\\ScreenShot\\" + fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void assertUrl(String text) {

        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

}
