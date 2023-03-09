@FLEET10-564
Feature: Login-1 without any parameter

Background:
  Given The user is on the login page

  @FLEET10-561
  Scenario: Login as a driver
    When The user logs as a driver
    Then The user is on the Quick Launcpad page

  @FLEET10-562
  Scenario: Login as a sales manager
    When The user logs as a sales manager
    Then The user is on the Dashboard page

  @FLEET10-563
  Scenario: Login as a store manager
    When The user logs as a store manager
    Then The user is on the Dashboard page

  @FLEET10-570
  Scenario: Login with an invalid password
    When The user enters an invalid password
    Then The user sees "Invalid username or password"

  @FLEET10-571
  Scenario: Login with an invalid password
    When The user enters an invalid username
    Then The user sees "Invalid username or password"

  @FLEET10-572
  Scenario: Login with an empty password
    When The user enters a username without a password
    Then The user sees "Lütfen bu alanı doldurun" in password field

  @FLEET10-573
  Scenario: Login with an empty username
    When The user enters a password without a username
    Then The user sees "Lütfen bu alanı doldurun" in username field

  @FLEET10-574
  Scenario: Login with empty username and password
    When The user does not enter a username and a password
    Then The user sees "Lütfen bu alanı doldurun" in username field

  @FLEET10-576
  Scenario: Clicking on forgot password link
    When The user clicks on the forgot password link
    Then The user sees landed on the Forgot Password page

  @FLEET10-577
  Scenario: Verify "remember me" link exists and clickable
    Then The user sees "remember me" link exists and clickable

  @FLEET10-581
  Scenario: Clicking on forgot password link
    Then The user sees the password in bullet signs by default

  @FLEET10-583
  Scenario: Verify Enter key works properly
    When The user clicks on the Enter key on the keyboard
    Then The user sees it worked as the login button

  @FLEET10-584
  Scenario: Verify name in the profile
    Given The user is on the login page
    When The user logs as a driver
    And The user sees the name in the profile
    When The user logs as a sales manager
    And The user sees again the name in the profile
    Then Verify the names are not the same



