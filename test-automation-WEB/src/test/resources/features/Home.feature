@Dashboard
Feature: Home
  As an admin
  I want to see the admin dashboard especially the home page
  So that I can manage users and threads

  @D1
  #Sukses melihat dashboard admin
  Scenario: As an admin, I want to see the admin dashboard
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    Then I can see summary stats for admin