@register
Feature:
  Background:
    Scenario:
      Given user is on Register Page
      And user select a "country" and set "phoneNumber" and "password"
      When  successful registration message appear
      And  the user click on confirmation button
      Then is