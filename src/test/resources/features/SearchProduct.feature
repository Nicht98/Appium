@search_products
Feature: search Products

  Scenario:
    Given the user is on the Main activity page
    When user click on login button
    Then redirect to the login page


  Scenario Outline: Find a product with search bar
    Given User is on search bar
    When User enter a "<product>" name in search bar
    And User validate his choice
    Then User should see products that contain "<product>"

    Examples:
      |product     |
      |Phone      |
