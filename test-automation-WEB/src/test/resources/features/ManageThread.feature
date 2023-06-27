@ManageThread
Feature: ManageThread
  As an admin
  I want to see the manage thread page
  So that I can manage threads

  @MT1
  #Sukses melihat jumlah thread di aplikasi squad space
  Scenario: As an admin, I want to see the number of threads in squad space
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage thread icon on the side bar
    When I am on the manage thread page
    Then I see the number of threads

  @MT2
  #Sukses melihat detail thread
  Scenario: As an admin, I want to be able to see thread details
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage thread icon on the side bar
    When I am on the manage thread page
    And I click on the view thread icon
    Then I am on the detail thread page

  @MT3
  #Sukses delete thread
  Scenario: As an admin, I want to be able to delete threads
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage thread icon on the side bar
    When I am on the manage thread page
    And I click the delete thread icon
    Then I click delete on the confirmation popup

  @MT4
  #Sukses mencari judul thread dari daftar thread
  Scenario: As an admin, I want to be able to search for a title from a list of the number threads
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage thread icon on the side bar
    When I am on the manage thread page
    And I click on the search icon
    And I click the column search for users
    And I input "chief" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "chief"