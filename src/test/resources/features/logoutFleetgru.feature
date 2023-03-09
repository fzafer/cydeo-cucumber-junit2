@FLEET10-591
Feature: Login-1 without any parameter

  Background:
    Given The user is on the login page

  @FLEET10-587
  Scenario: Verify logout successfully
    When The user logs as a driver
    And The user logs out
    Then The user sees landing on the login page

  @FLEET10-588
  Scenario: Verify logout after step back
    When The user logs as a driver
    And The user logs out
    And The user clicks step back button
    Then The user sees landing on the login page

  @FLEET10-589
  Scenario: Verify logout after closing tabs
    When The user logs as a driver
    And The user closes all the tabs
    And The user opens Dashboard page
    Then The user sees landing on the login page

  @FLEET10-590
  Scenario: Verify logout after 3 min away
    When The user logs as a driver
    And The user wait for 3 mins
    And The user opens Dashboard page
    Then The user sees landing on the login page

