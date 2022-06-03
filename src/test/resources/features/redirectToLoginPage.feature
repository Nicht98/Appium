@redirection
Feature: redirect to the login Page
  Background:
  Scenario:
    Given the permission1 is displayed
    When  the user click on allow
    And   click on allow again
    Then  the loginPage is displayed


  Scenario:
    Given the user is on the Main activity page
    When user click on login button
    Then redirect to the login page