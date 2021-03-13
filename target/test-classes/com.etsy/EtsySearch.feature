@search
Feature: Etsy Search Functionality


  Background: navigate to etsy
    Given : the user navigates to "https://www.etsy.com"


   @hat   @tc1  @smoke  @regression
  Scenario: Validation of etsy search
    When  The user search with "Hat"
    Then the user should see the title "Hat | Etsy"

   @key  @tc2  @smoke  @regression
  Scenario: Validation of etsy search
    When  The user search with "Key"
    Then the user should see the title "Key | Etsy"

   @ring    @tc3    @regression
  Scenario: Validation of etsy search
    When  The user search with "Ring"
    Then the user should see the title "Ring | Etsy"