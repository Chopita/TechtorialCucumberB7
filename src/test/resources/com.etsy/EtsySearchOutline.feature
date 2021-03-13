@outline
Feature: Etsy Search With Scenario Outline

  Background: Navigate
    Given : the user navigates to "https://www.etsy.com"

  Scenario Outline: Etsy Search Validation
    When The user search with "<searchValue>"
    Then the user should see the title "<title>"
    Examples:
      | searchValue | title        |
      | Hat         | Hat \| Etsy  |
      | Key         | Key \| Etsy  |
      | Ring        | Ring \| Etsy |

