Feature: Netmeds Login
  Scenario: Successful login with valid credentials
    Given The user is on the login page
    When The user enters a valid email and password
    And Clicks on the login button
    Then The user should be logged in successfully

  Scenario: Unsuccessful login with invalid credentials
    Given The user is on the login page
    When The user enters an invalid email and password
    And Clicks on the login button
    Then An error message should be displayed
   