@ThreadReport
Feature: ThreadReport
  As an admin
  I want to see the thread report page
  So that I can manage thread reports from users

  @TR1
  #Sukses melihat jumlah thread yang dilaporkan
  Scenario: As an admin, I want to see the report thread count in squad space app
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click thread report icon on the side bar
    When I am on the thread report page
    Then I see the report thread count

  @TR2
  #Sukses melihat detail thread
  Scenario: As an admin, I want to be able to see thread details
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click thread report icon on the side bar
    When I am on the thread report page
    And I click on the view thread icon
    Then I am on the detail thread page

  @TR3
  #Sukses menyetujui laporan thread
  Scenario: As an admin, I want to be able to approve thread reports
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click thread report icon on the side bar
    When I am on the thread report page
    And I click the approve report icon
    Then I click the agree button on the confirmation popup

  @TR4
  #Sukses menolak laporan thread
  Scenario: As an admin, I want to be able to decline thread reports
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click thread report icon on the side bar
    When I am on the thread report page
    And I click the reject report icon
    Then I click the reject button on the confirmation popup

  @TR5
  #Sukses mencari judul thread dari daftar thread yang dilaporkan
  Scenario: As an admin, I want to be able to search for a title from a list of the number threads report
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click thread report icon on the side bar
    When I am on the thread report page
    And I click on the search icon
    And I click the column search for users
    And I input "investor" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "investor"