Feature: As a customer I want to search for a product on the e-commerce website .


  Scenario:  Successfully  search for a laptop.
    Given I am on the homepage
    And I enter "laptop" in the search bar
    When I press the Enter key on the keyboard
    Then I should see a list of search results related to "laptop"

  Scenario: Verify Search with Special Characters.
    Given I enter special characters into the search bar
    When I click on the search icon or press enter
    Then I should see a message indicating that no products were found




