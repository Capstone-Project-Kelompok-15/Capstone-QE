@register
Feature: Register
  As a user, I want to success register, So that I can success login

  @register-success
  Scenario: As a user, I have be able to create new account
    Given I'm on the login page
    And I click register link
    When I am on the register page
    And I input fullname
    And I input email
    And I input password
    And I click register button
    Then I am on the landing page

  @register-fullname
  Scenario: As a user, I can't create an account because I don't fill in the fullname
    Given I'm on the login page
    And I click register link
    When I am on the register page
    And I didn't fill in the fullname
    And I input email
    And I input password
    And I click register button
    Then I see error message: "fullname can not empty"

  @register-email
  Scenario: As a user, I can't create an account because I don't fill in the email
    Given I'm on the login page
    And I click register link
    When I am on the register page
    And I input fullname
    And I didn't fill in the email
    And I input password
    And I click register button
    Then I see error message: "email can not empty"

  @register-password
  Scenario: As a user, I can't create an account because I don't fill in the password
    Given I'm on the login page
    And I click register link
    When I am on the register page
    And I input fullname
    And I input email
    And I didn't fill in the password
    And I click register button
    Then I see error message: "password can not empty"

  @register-already
  Scenario: As a user, I can't create an account because it uses existing data
    Given I'm on the login page
    And I click register link
    When I am on the register page
    And I click register button
    Then I see error message: "Gagal :("