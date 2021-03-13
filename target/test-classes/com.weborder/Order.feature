@order
Feature: Web page Food order

  @tc6  @regression
  Scenario: Validation of food for office
    Given the user is on weborder home page
    Then user select "Office" option
    And the user on the group order page
    Then the user send invitees note "Test"
    And the user send invite list
      | Kushal@gmail.com   |
      | Priyanka@gmail.com |
      | patel@gmail.com    |
      | sandeep@gmail.com  |
      | chopa@gmail.com    |
      | maha@gmail.com     |
      | belyi@gmail.com    |
      | kosmos@gmail.com   |
      | pchela@gmail.com   |
      | fil@gmail.com      |



    And the user validate "View Group Order"
    * the user validate total participants is 1

