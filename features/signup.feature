
Feature: use can sign up if they cant login

  @smoke @e2e
  Scenario: User can sign up
    Given user is on trello home page
    And user goes to trello login page
    When user says they cannot sign in
    Then user should see cant login link