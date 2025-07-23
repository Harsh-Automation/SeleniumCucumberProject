Feature: As a new user I should be able to sign up to the web application AutomationPractise

  Scenario Outline: Login to portal with valid details
    Given User is on the homepage
    And Signup button is present on the homepage
    When User clicks on the Signup/Login button
    Then User is redirected to the Signup/Login screen
    When User enter username "<Username>"
    And User enters password "<Password>"
    And User clicks on Login button
    Then Username "<ExpectedText>" is displayed on the homepage

    Examples: 
      | Username          | Password   | ExpectedText        |
      | QA.TEST@gmail.com | Test@12345 | Logged in as QATEST |
