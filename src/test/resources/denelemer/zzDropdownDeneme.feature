Feature: Dropdown page search functionality and verifications


  Scenario: Dropdown page search functionality and verifications
    Given User is on cydeo dropdown home page
    When User clicks "December" from the dropdown menu
    Then User sees "December" is selected



  @ScenarioOutline
  Scenario Outline: Dropdown page search functionality and verifications
    Given User is on cydeo dropdown home page
    When User clicks "<searchValue>" from the dropdown menu
    Then User sees "<expectedMonths>" is selected

    @months
    Examples: search values we are going to be using in this scenario is as below
      | searchValue | expectedMonths |
      | January     | January       |
      | February    | February      |
      | March       | March         |
      | April       | April         |
      | May         | May           |
      | June        | June          |
      | July        | July          |
      | August      | August        |
      | September   | September     |
      | October     | October       |
      | November    | November      |
      | December    | December      |