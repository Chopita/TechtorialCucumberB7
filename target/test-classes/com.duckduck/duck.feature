Feature: Search Selenium
  Scenario: Validate search result contains Selenuim Keywords
    Given : user on DuckDuckGo home webpage
    When : user searches for Selenium
    Then : the user should see the result about Selenium
    And : result contains Selenium keyword