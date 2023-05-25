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

  @logwithoutemail
  Scenario: As user, I login without email
    Given I am open the home page1
    Given I am open the login page1
    Given I am on the login page1
    And I enter valid password1
    And I click login button1
    Then i can see error message

  @logwithoutpassword
  Scenario: As user, I login without password
    Given I am open the home page2
    Given I am open the login page2
    Given I am on the login page2
    When I enter valid email2
    And I click login button2
    Then i can see error message2

  @invalidlogin
  Scenario: As user, I invalid login without password and email
    Given I am open the home page3
    Given I am open the login page3
    Given I am on the login page3
    And I click login button3
    Then i can see error message3