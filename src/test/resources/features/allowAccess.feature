@AppInit
  Feature: allow app to access phone feature
    Scenario:
      Given the app is launch
      And the permission1 is displayed
      When  the user click on allow
      And   the next permission is displayed
      And   click on allow again
      Then  the Initialization page is displayed