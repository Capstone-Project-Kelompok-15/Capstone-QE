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

  @regUserNew1invalid1
  Scenario: As user, I register without username
    Given I am open the register page1
    Given I am on the register page1
    And I enter valid email1
    And I enter register valid password1
    And I click register button1
    Then I receive error message1

  @regUserNew1invalid2
  Scenario: As user, I register without email
    Given I am open the register page2
    Given I am on the register page2
    When I enter register valid username2
    And I enter register valid password2
    And I click register button2
    Then I receive error message2

  @regUserNew1invalid3
  Scenario: As user, I register without password
    Given I am open the register page3
    Given I am on the register page3
    When I enter register valid username3
    And I enter valid email3
    And I click register button3
    Then I receive error message3

  @regUserNew1invalid4
  Scenario: As user, I register with old user
    Given I am open the register page4
    Given I am on the register page4
    When I enter register valid username4
    And I enter valid email4
    And I enter register valid password4
    And I click register button4
    Then I receive error message4