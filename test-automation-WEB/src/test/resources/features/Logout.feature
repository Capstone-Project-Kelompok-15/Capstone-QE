@Logout
Feature: Logout
  As an admin
  I want to logout from dashboard page

  @LT1
  #Sukses logout
  Scenario: As an admin, I want to logout successfully
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click logout button
    And I click exit on the confirmation popup
    Then I am on the landing page