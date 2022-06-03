@login
  Feature: login to the App

    Background:
    Scenario:
      Given the user is on the Main activity page
      When user click on login button
      Then redirect to the login page

    Scenario Outline:
      Given the user is on the logIn page
      When user select a country
      And enter his "name" and "pass"
      Then redirect to the login page
      Examples:
        |name     |pass   |
        |690904999|test123|
