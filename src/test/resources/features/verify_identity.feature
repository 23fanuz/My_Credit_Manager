Feature: Identity Verification

  Scenario Outline:Initial identity verification with valid credentials
    Given user is on My Credit Manager homepage
    When user inputs "<First Name>"
    And user inputs "<Last Name>"
    And user inputs "<Street Address>"
    And user inputs "<City>"
    And user selects "<State>"
    And user inputs "<Zip Code>"
    And user clicks on Submit button
    And user selects "<Month>"
    And user selects "<Day>"
    And user selects "<Year>"
    And user inputs last 4 digits of their "<last 4 digits of SSN>"
    And user clicks Submit button
    Then user enters "<first 3 digits of SSN> followed by "<remaining SSN>"
    And  user clicks Submit button
    Then user is taken to Questionnaire section
    Examples:
      |First Name | Last Name | Street Address | City        | State | Zip Code | Month | Day | Year | last 4 digits of SSN | first 3 digits of SSN | remaining SSN |
      | Thomas    | Devos     | 110 Beer Creek | Tuscaloosa  | AL    | 35405    | 09    | 06  | 1957 | 3511                 | 666                   | 02            |
