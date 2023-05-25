@products
Feature: products
  As a user
  I want to buy product

  @checkoutandbuy
  Scenario: As user, I can login and add products to my cart
    Given I am open the home page to view all products6
    Given I am open the login page to view all products6
    Given I am on the login page to view all products6
    When I enter valid username to view all products6
    And I enter valid password to view all products6
    And I click login button to view all products6
    And I buy to add products cart6
    And I go to my cart6
    Then I pay the products6