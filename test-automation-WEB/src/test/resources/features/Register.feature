@register
Feature: Register
  As a user
  I want to register a new account
  So that I can login with new account

  @regUserNew1valid1
  Scenario: As user, I register with username
    Given I am open the register page
    Given I am on the register page
    When I enter register valid username
    And I enter valid email
    And I enter register valid password
    And I click register button
    Then I am back on the login page
