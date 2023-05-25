@products
Feature: products
  As a user
  I want to see all products

  @viewallproducts
  Scenario: As user, I can login and view all products
    Given I am open the home page to view all products
    Given I am open the login page to view all products
    Given I am on the login page to view all products
    When I enter valid username to view all products
    And I enter valid password to view all products
    And I click login button to view all products
    Then I am on the home page and can view all products

  @viewallcategoriesproducts
  Scenario: As user, I can login and view all products categories
    Given I am open the home page to view all products categories
    Given I am open the login page to view all products categories
    Given I am on the login page to view all products categories
    When I enter valid username to view all products categories
    And I enter valid password to view all products categories
    And I click login button to view all products categories
    And I click Triangle button on products categories
    Then I can view all products categories

  @viewproductsbycategories
  Scenario: As user, I can login and view products by categories
    Given I am open the home page to view all products categories1
    Given I am open the login page to view all products categories1
    Given I am on the login page to view all products categories1
    When I enter valid username to view all products categories1
    And I enter valid password to view all products categories1
    And I click login button to view all products categories1
    And I click Triangle button on products categories1
    And I choose gaming Categories1
    Then I can view gaming categories product1

  @buytoaddcart
  Scenario: As user, I can login and add products to my cart
    Given I am open the home page to view all products1
    Given I am open the login page to view all products1
    Given I am on the login page to view all products1
    When I enter valid username to view all products1
    And I enter valid password to view all products1
    And I click login button to view all products1
    And I buy to add products cart1
    Then i can see the product add to my cart1

  @seedetailproducts
  Scenario: As user, I can login and see products detail
    Given I am open the home page to view all products2
    Given I am open the login page to view all products2
    Given I am on the login page to view all products2
    When I enter valid username to view all products2
    And I enter valid password to view all products2
    And I click login button to view all products2
    And I click detail to see detail product2
    Then i can see the detail product add to my cart2