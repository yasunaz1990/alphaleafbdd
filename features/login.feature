@uat
Feature: Trello login capability

  @reg
  Scenario: Invalid login results in error message
    Given user is on trello home page
    And user goes to trello login page
    When user enters invalid credentials
    And user clicks login button
    Then user should see error message

  @smoke
  Scenario: User can click cant login link
    Given user is on trello home page
    And user goes to trello login page
    When user scroll down
    Then user should see cant login link