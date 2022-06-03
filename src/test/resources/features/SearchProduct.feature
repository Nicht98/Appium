Feature: Found Products

  Background: Application initialization
    Given user launches the application
    And he lets the application to make call
    And he lets the application to access medias
    And he skip the authentication screen
    When user chooses his(her) country "Cameroon"
    And he authorizes the application to get position
    Then he should access home page

  @TEST_OF-649
  Scenario Outline: Find a product with search bar
    Given User is on search bar
    When User enter a "<product>" in search bar
    And User validate his choice
    Then User should see products that contain "<product>"

    Examples:
      |product     |
      |Phone      |
