@AllowApp
  Feature: allow app to access phone feature
    Scenario:
      Given the permission1 is displayed
      When  the user click on allow
      And   click on allow again
      Then  the loginPage is displayed