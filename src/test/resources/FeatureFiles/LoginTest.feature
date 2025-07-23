Feature: As a new user I should be able to sign up to the web application AutomationPractise

  Scenario: Signup to portal with valid details
    Given User is on the homepage
    And Signup button is present on the homepage
    When User clicks on the Signup/Login button
    Then User is redirected to the Signup screen
    When User enters a valid username
    And User enters a valid email ID
    And User clicks on the Signup button on the signup page
    Then User is redirected to the Add Account Details screen
    When User enters a valid password
    And User enters their first name
    And User enters their last name
    And User enters their home address
    And User enters their state
    And User enters their city
    And User enters their zipcode
    And User enters their phone number
    And User clicks on the Create Account button
    Then User account should be successfully created
    When User clicks on Continue button
    Then Logout button is displayed on the homepage
