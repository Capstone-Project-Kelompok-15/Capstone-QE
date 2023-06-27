@Profil
Feature: Profil
  As an admin
  I want to see the profile page
  So that I can manage my profile

  @P1
  #Sukses mengubah foto profil
  Scenario: As an admin, I want to change my picture profil
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click the profile button
    When I am on the change profile page
    And I click change profile picture
    Then I click the save button

  @P2
  #Sukses mengubah username
  Scenario: As an admin, I want to change my username
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click the profile button
    When I am on the change profile page
    And I input a new "username"
    And I click the save button
    And I click save on the confirmation popup
    And I click button back
    Then I see the results of the changes

  @P3
  #Sukses mengubah email
  Scenario: As an admin, I want to change my email
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click the profile button
    When I am on the change profile page
    And I input a new "email"
    And I click the save button
    And I click save on the confirmation popup
    And I click button back
    Then I see the results of the changes


  @P4
  #Sukses mengubah password
  Scenario: As an admin, I want to change my password
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click the profile button
    When I am on the change profile page
    And I input a new "password"
    And I input a new "password confirmation"
    And I click the save button
    And I click save on the confirmation popup
    And I click button back
    Then I see the results of the changes

  @P5
  #Sukses mengubah semua field
  Scenario: As an admin, I want to change my profile
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click the profile button
    When I am on the change profile page
    And I input a new "username"
    And I input a new "email"
    And I input a new "password"
    And I input a new "password confirmation"
    And I click the save button
    And I click save on the confirmation popup
    And I click button back
    Then I see the results of the changes