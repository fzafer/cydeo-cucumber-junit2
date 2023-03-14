Feature: FleetGru webpage log ın functionality

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  @Wip
  Scenario: Log in as a truck driver
    When User enter driver username
    And  User enter driver password
    And  User click the log in button
    Then User is on the Quick Launchpad page

  Scenario: Log in as a store manager
    When User enter store manager username
    And  User enter store manager password
    And  User click the log in button
    Then User is on the Dashboard

  Scenario: Log in as a sales manager
    When  User enter sales manager username
    And   User enter sales manager password
    And   User click the log in button
    Then  User is on the Dashboard

  Scenario: Log in with invalid username
    When  User enter invalid username
    And   User enter valid password
    And   User click the log in button
    Then  User should see "Invalid username or password" on the log in page


  Scenario: Log in with invalid password
    When  User enter valid username
    And   User enter invalid password
    And   User click the log in button
    Then  User should see "Invalid username or password" on the log in page

  Scenario: Log in with empty username
    When  User enter valid password
    And   User click the log in button
    Then  Username field should throw "Please fill out this field" warning message

  Scenario: Log in with empty password
    When  User enter valid username
    And   User click the log in button
    Then  Password field should throw "Please fill out this field" warning message

  Scenario: Log in with empty username and password
    When   User click the log in button
    Then  User  should see just username field should throw the "Please fill out this field" warning message

  Scenario: After clicking on the "Forgot your password?" link , User land on the ‘Forgot Password’ page
    When  Users click the "Forgot your password?" link
    Then  User land on the "Forgot Password" page

  Scenario: Check "Remember Me" link exists and is clickable on the login page
    When  User click the "Remember Me" link
    Then  "Remember Me" link should exist and clickable

  Scenario: Password is in bullet signs by default (like ****)
    When  User enter valid username
    And   User enter valid password
    Then  User should password in bullet signs by default

  Scenario: Enter key of the keyboard is working correctly
    When  User enter valid username
    And   User enter valid password
    And   User press Enter key of the keyboard
    Then  User should see dashboard

  Scenario: All users can see their own usernames in the profile menu, after successful login
    When  User enter valid username
    And   User enter valid password
    And   User click the log in button
    Then  User should see their own usernames in the profile menu, after successful login


  Scenario: Log out by using the logout button
    When  User enter valid username
    And   User enter valid password
    And   User click the log in button
    And   User click log out button
    Then  User should land on the Login page

  Scenario: After successfully log out,user can not go to the home page again by clicking the step back button
    When  User enter valid username
    And   User enter valid password
    And   User click the log in button
    And   User click log out button
    And   User click step back button
    Then  User can not go to the home page again

  Scenario: After closes the open tab ,user must be logged out
    When  User enter valid username
    And   User enter valid password
    And   User click the log in button
    And   User close the open tabs
    And   The user open web page again
    Then  The user should land on the login page

  Scenario: After being away from the keyboard for three minutes,user must be logged out
    When  User enter valid username
    And   User enter valid password
    And   User click the log in button
    And   The user wait for three minutes
    Then  The user should land on the login page