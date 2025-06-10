Feature: As a customer I want to search for a laptop on the Amazon website So that I can find the specific laptop.
  Scenario:  Successfully  search for a laptop.
    Given I am on the homepage
    And I enter "laptop" in the search bar
    When I press the Enter key on the keyboard
    Then I should see a list of search results related to "laptop"
