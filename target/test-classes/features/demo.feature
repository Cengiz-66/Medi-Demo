
Feature: User is on page
@wip
  Scenario: User should on the page
    Given the user on the page
    When the user search "Java"
    Then User should see search result