Feature: Nop Commerce Web Application

  Scenario: Login with valid credntials
    Given User is on the Nop Commerce Homepage
    
    When User clicks on Login button
    And User enters emailId "QA-Automation@gmail.com"
    And User enters password "Test@123"
    And User Clicks on Login button to login to the Application
    Then User logged in successful
    And My Account is menu is shown on the Homepage