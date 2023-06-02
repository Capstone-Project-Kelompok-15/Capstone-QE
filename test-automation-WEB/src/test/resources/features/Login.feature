@login
Feature: login
  As a user
  I want to see my home page
  So that I can login with my account

  @loginUserNew1
  Scenario: As user, I login with valid email and password
    Given I am open the home page
    Given I am open the login page
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page
