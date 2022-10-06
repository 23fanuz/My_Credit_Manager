package com.array.pages;

import com.array.utilities.Driver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class VerifyIdentityPage {

    String shadowHost = "array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']";


    private WebElement firstNameTxtBox;

    public WebElement getFirstNameTxtBox() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

        firstNameTxtBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));

        return firstNameTxtBox;
    }

    private WebElement lastNameTxtBox;

    public WebElement getLastNameTxtBox() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

      lastNameTxtBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
        return lastNameTxtBox;
    }

    private WebElement streetAddressTxtBox;

    public WebElement getStreetAddressTxtBox() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       streetAddressTxtBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
        return streetAddressTxtBox;
    }

    private WebElement cityTxtBox;

    public WebElement getCityTxtBox() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       cityTxtBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
        return cityTxtBox;
    }

    private WebElement stateDropDown;

    public WebElement getStateDropDown() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

        stateDropDown =  shadow.findElement(By.cssSelector(".svelte-ds3p4j.placeholder-visible"));
        return stateDropDown;
    }

    private WebElement zipCodeTxtBox;

    public WebElement getZipCodeTxtBox() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       zipCodeTxtBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(6) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
        return zipCodeTxtBox;
    }

    private WebElement nextButton;

    public WebElement getNextButton() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

        nextButton = shadow.findElement(By.cssSelector(".svelte-tb0h00.arr-stretch"));
        return nextButton;
    }

    private WebElement monthDropDown;

    public WebElement getMonthDropDown() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       monthDropDown = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1)"));
        return monthDropDown;
    }

    private WebElement dayDropdown;

    public WebElement getDayDropdown() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       dayDropdown = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1)"));
        return dayDropdown;
    }

    private WebElement yearDropDown;

    public WebElement getYearDropDown() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       yearDropDown = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > select:nth-child(1)"));
        return yearDropDown;
    }

    private WebElement thirdSSNTextBox;

    public WebElement getThirdSSNTextBox() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       thirdSSNTextBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > fieldset:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
        return thirdSSNTextBox;
    }

    private WebElement submitButton;

    public WebElement getSubmitButton() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

      submitButton = shadow.findElement(By.cssSelector(".svelte-tb0h00.arr-stretch"));
        return submitButton;
    }

    private WebElement firstSSNTextBox;

    public WebElement getFirstSSNTextBox() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       firstSSNTextBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > fieldset:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
        return firstSSNTextBox;
    }

    private WebElement secondSSNTextBox;

    public WebElement getSecondSSNTextBox() {
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

      secondSSNTextBox = shadow.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > fieldset:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));
        return secondSSNTextBox;
    }

    private WebElement lastSubmitButton;

    public WebElement getLastSubmitButton() {

        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

       lastSubmitButton = shadow.findElement(By.cssSelector(".svelte-tb0h00.arr-stretch"));
        return lastSubmitButton;
    }

    private WebElement questionnaireHeading;

    public WebElement getQuestionnaireHeading() throws InterruptedException {


        Thread.sleep(1000);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("array-account-enroll[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();


        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("array-authentication-kba[appkey='60CDFC3B-188E-41B8-A475-D495CC4645F2']")).getShadowRoot();

        Thread.sleep(1000);

        shadow1.findElement(By.cssSelector(" style:nth-child(1)"));


      questionnaireHeading =  shadow1.findElement(By.cssSelector(".arr-title-lg.svelte-1t9noxk"));
        return questionnaireHeading;
    }
}



