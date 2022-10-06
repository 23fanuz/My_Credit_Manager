package com.array.step_definitions;

import com.array.pages.VerifyIdentityPage;
import com.array.utilities.ConfigurationReader;
import com.array.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ConcurrentModificationException;

public class VerifyIdentityStepDef {

    VerifyIdentityPage verifyIdentityPage = new VerifyIdentityPage();

    @Given("user is on My Credit Manager homepage")
    public void user_is_on_my_credit_manager_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification failed","My Credit Manager", actualTitle);
    }
    @When("user inputs first name {string}")
    public void user_inputs_first_name(String firstName) {
        verifyIdentityPage.getFirstNameTxtBox().sendKeys(firstName);

    }
    @When("user inputs last name {string}")
    public void user_inputs_last_name(String lastName) {
        verifyIdentityPage.getLastNameTxtBox().sendKeys(lastName);

    }
    @When("user inputs street address {string}")
    public void user_inputs_street_address(String address) {
        verifyIdentityPage.getStreetAddressTxtBox().sendKeys(address);
    }
    @When("user inputs city {string}")
    public void user_inputs_city(String city) {
        verifyIdentityPage.getCityTxtBox().sendKeys(city);

    }
    @When("user selects state {string}")
    public void user_selects_state(String state) {
        Select states = new Select(verifyIdentityPage.getStateDropDown());
        states.selectByValue(state);
    }
    @When("user inputs zip code {string}")
    public void user_inputs_zip_code(String zip) {
     verifyIdentityPage.getZipCodeTxtBox().sendKeys(zip);
    }
    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
     verifyIdentityPage.getSubmitButton().click();
    }
    @When("user selects birth month {string}")
    public void user_selects_birth_month(String month) {
       Select monthDropDown = new Select(verifyIdentityPage.getMonthDropDown());
       monthDropDown.selectByValue(month);
    }
    @When("user selects birth day {string}")
    public void user_selects_birth_day(String birthDay) {
      Select day = new Select(verifyIdentityPage.getDayDropdown());
      day.selectByValue(birthDay);
    }
    @When("user selects birth year {string}")
    public void user_selects_birth_year(String birthYear) {
      Select year = new Select(verifyIdentityPage.getYearDropDown());
      year.selectByValue(birthYear);
    }
    @When("user inputs last four digits of their {string}")
    public void user_inputs_last_four_digits_of_their(String lastFourSSN) {
      verifyIdentityPage.getThirdSSNTextBox().sendKeys(lastFourSSN);
    }
    @When("user clicks Submit button for second time")
    public void user_clicks_submit_button_for_second_time() {
        verifyIdentityPage.getLastSubmitButton().click();
    }
    @Then("user enters first three digits of their SSN {string} followed by {string}")
    public void user_enters_first_three_digits_of_their_ssn_followed_by(String firstThreeDigitsSSN, String middleDigitsSSN) {
       verifyIdentityPage.getFirstSSNTextBox().sendKeys(firstThreeDigitsSSN);
       verifyIdentityPage.getSecondSSNTextBox().sendKeys(middleDigitsSSN);
    }
    @Then("user clicks final Submit button")
    public void user_clicks_final_submit_button() {
        verifyIdentityPage.getLastSubmitButton().click();
    }

    @Then("user is taken to Questionnaire section with following heading {string}")
    public void userIsTakenToQuestionnaireSectionWithFollowingHeading(String questionnaireHeading) throws InterruptedException {

        String expectedQuestionnaireHeading = "Please select the correct answers to these questions so we can verify your identity";
        Assert.assertEquals("Heading verification failed",expectedQuestionnaireHeading, verifyIdentityPage.getQuestionnaireHeading().getText());
    }
}
