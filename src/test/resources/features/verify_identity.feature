Feature: Identity Verification

  @test1
  Scenario Template:Initial identity verification with valid credentials
    Given user is on My Credit Manager homepage
    When user inputs first name "<First Name>"
    And user inputs last name "<Last Name>"
    And user inputs street address "<Street Address>"
    And user inputs city "<City>"
    And user selects state "<State>"
    And user inputs zip code "<Zip Code>"
    And user clicks on Submit button
    And user selects birth month "<Month>"
    And user selects birth day "<Day>"
    And user selects birth year "<Year>"
    And user inputs last four digits of their "<last 4 digits of SSN>"
    And user clicks Submit button for second time
    Then user enters first three digits of their SSN "<first 3 digits of SSN>" followed by "<remaining SSN>"
    And  user clicks final Submit button
    Then user is taken to Questionnaire section with following heading "<Please select the correct answers to these questions so we can verify your identity>"
    Examples:
      |First Name | Last Name | Street Address | City        | State | Zip Code | Month | Day | Year | last 4 digits of SSN | first 3 digits of SSN | remaining SSN |
      | Thomas    | Devos     | 110 Beer Creek | Tuscaloosa  | AL    | 35405    | 09    | 06  | 1957 | 3511                 | 666                   | 02            |
