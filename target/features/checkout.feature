
Feature:   As  a customer I want to checkout an bag on the e-commerce website So that I can purchase the item.
  Background:
    Given I am logged in as a registered user
  Scenario:  Successfully checkout an item.
    Given I have added an item to my cart
    And I Click on to checkout button
    And I have entered my information
    And I Click on to continue button
    When I Click on to finish button
    Then I should see a confirmation message
    And the item should be removed from my cart

  Scenario:  Successfully checkout multiple item.
    Given I have added multiple items to my cart
    And I Click on to checkout button
    And I have entered my information
    And I Click on to continue button
    When I Click on to finish button
    Then I should see a confirmation message
    And the item should be removed from my cart


