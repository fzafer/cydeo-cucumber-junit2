Feature: Movie suggestion feature
  As a user, I should be able to get movies according to my preferance


  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatable list
    Given I like
    | actions |
    | drama |
    | cartoon |
    | adventure |
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatable map
    Given I like below movies with certain types
      | actions   | Terminator  |
      | drama     | Titanic     |
      | cartoon   | Tom Jerry   |
      | adventure | Tomb Raider |
    When I go to homepage
    Then I should get right recommendation

  Scenario Outline: Should be able to add two numbers
    Given Calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalNumber>
    Examples:
      | firstNumber | secondNumber | finalNumber |
      | 3           | 4            | 7           |
      | 1           | 3            | 4           |
      | 3           | 5            | 8           |