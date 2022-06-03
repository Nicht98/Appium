@login
  Feature: login to the App

    Background:
    Scenario:
      Given the app is launch
      And the permission1 is displayed
      When  the user click on allow
      And   the next permission is displayed
      And   click on allow again
      Then  the Initialization page is displayed

    Scenario Outline:
      Given the user is on the Initialization page
      And click to login button
      When enter his "<name>" and "<pass>"
      And click on login button
      Then the user is redirect to HomePage
      Examples:
        |name     |pass   |
        |690904999|test123|
