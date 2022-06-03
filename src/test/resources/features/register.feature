@register
Feature:
  Background:
    Scenario:
      Given the app is launch
      And the permission1 is displayed
      When  the user click on allow
      And   the next permission is displayed
      And   click on allow again
      Then  the Initialization page is displayed

  Scenario Outline:
    Given user is on Register Page
    And user select a "<country>"
    And set "<phoneNumber>" and "<password>"
    And click on create account
    When  successful registration message appear
    And  the user click on confirmation button
    Then the user is on homePage

    Examples:
      |country |phoneNumber|password|
      |cameroun|690904999  |test123 |