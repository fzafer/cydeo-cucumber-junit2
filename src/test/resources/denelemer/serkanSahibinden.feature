Feature: Sahibinden search functionality
  Agile story : As an user, when I am on the search page
  I should be able to make some search and I want to see relevant
  result which defined in scenarios.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given open sahibinden.com


  Scenario: Finding cheapest car by choosing randomly from search list
    When user enter a car brand
    And user enter the car model
    Then User should see the Cheapest car's page on screen