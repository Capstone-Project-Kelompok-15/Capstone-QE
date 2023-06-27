@ManageUser
Feature: ManageUser
  As an admin
  I want to see the manage user page
  So that I can manage users

  @MU1
  #Sukses melihat jumlah pengguna
  Scenario: As an admin, I want to see the number of squad space application users
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    Then I see the number of app users

  @MU2
  #Sukses mute pengguna selama 1 hari
  Scenario: As an admin, I want to be able to mute users for 1 day
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the mute user icon
    And I click the mute option for "1 day"
    Then I click the mute button

  @MU3
  #Sukses mute pengguna selama 7 hari
  Scenario: As an admin, I want to be able to mute users for 7 days
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the mute user icon
    And I click the mute option for "7 days"
    Then I click the mute button

  @MU4
  #Sukses mute pengguna selama 1 bulan
  Scenario: As an admin, I want to be able to mute users for 1 month
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the mute user icon
    And I click the mute option for "1 month"
    Then I click the mute button

  @MU5
  #Sukses mute pengguna selama 1 tahun
  Scenario: As an admin, I want to be able to mute users for 1 year
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the mute user icon
    And I click the mute option for "1 year"
    Then I click the mute button

  @MU6
  #Sukses block pengguna
  Scenario: As an admin, I want to block a user
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the block user icon
    Then I click the block button

  @MU7
  #Sukses melihat jumlah pengguna online
  Scenario: As an admin, I want to see the number of online users of squad room app
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    Then I see the number of online users of the application

  @MU8
  #Sukses mute pengguna selama 1 hari
  Scenario: As an admin, I want to be able to mute users for 1 day
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    And I click the mute user icon
    And I click the mute option for "1 day"
    Then I click the mute button

  @MU9
  #Sukses mute pengguna selama 7 hari
  Scenario: As an admin, I want to be able to mute users for 7 day
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    And I click the mute user icon
    And I click the mute option for "7 days"
    Then I click the mute button

  @MU10
  #Sukses mute pengguna selama 1 bulan
  Scenario: As an admin, I want to be able to mute users for 1 month
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    And I click the mute user icon
    And I click the mute option for "1 month"
    Then I click the mute button

  @MU11
  #Sukses mute pengguna selama 1 tahun
  Scenario: As an admin, I want to be able to mute users for 1 year
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    And I click the mute user icon
    And I click the mute option for "1 year"
    Then I click the mute button

  @MU12
  #Sukses block pengguna
  Scenario: As an admin, I want to block a user
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    Then I click on the block user icon

  @MU13
  #Sukses melihat jumlah pengguna yang diblokir
  Scenario: As an admin, I want to see the number of blocked users in the squad space app
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    Then I see the number of blocked app users

  @MU14
  #Sukses mute pengguna selama 1 hari
  Scenario: As an admin, I want to be able to mute users for 1 day
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click the mute user icon
    And I click the mute option for "1 day"
    Then I click the mute button

  @MU15
  #Sukses mute pengguna selama 7 hari
  Scenario: As an admin, I want to be able to mute users for 7 day
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click the mute user icon
    And I click the mute option for "7 days"
    Then I click the mute button

  @MU16
  #Sukses mute pengguna selama 1 bulan
  Scenario: As an admin, I want to be able to mute users for 1 month
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click the mute user icon
    And I click the mute option for "1 month"
    Then I click the mute button

  @MU17
  #Sukses mute pengguna selama 1 tahun
  Scenario: As an admin, I want to be able to mute users for 1 year
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click the mute user icon
    And I click the mute option for "1 year"
    Then I click the mute button

  @MU18
  #Sukses unblock pengguna
  Scenario: As an admin, I want to unblock the user
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click the unblock user icon
    Then I click the unblock button in the confirmation pop up

  @MU19
  #Sukses melihat jumlah pengguna yang dimute
  Scenario: As an admin, I want to see the number of muted users in the squad space app
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the card for the number of muted users
    Then I see the number of muted app users

  @MU20
  #Sukses unmute pengguna
  Scenario: As an admin, I want to unmute the user
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the card for the number of muted users
    When I am on the page for the number of muted users
    And I click the unmute user icon
    Then I click the unmute button in the confirmation popup

  @MU21
  #Sukses block pengguna
  Scenario: As an admin, I want to block a user
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the card for the number of muted users
    When I am on the page for the number of muted users
    And I click on the block user icon
    Then I click the block button

  @MU22
  #Sukses mencari nama dari jumlah pengguna
  Scenario: As an admin, I want to be able to search for the name of the number of users
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the search icon
    And I click the column search for users
    And I input "irma" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "irma"


  @MU23
  #Sukses mencari nama dari pengguna online
  Scenario: As an admin, I want to be able to search for the name of the online users
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click on the online user card
    When I am on the online user page
    And I click on the search icon
    And I click the column search for users
    And I input "tim" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "tim"

  @MU24
  #Sukses mencari nama dari jumlah pengguna yang diblokir
  Scenario: As an admin, I want to be able to search for a name from a list of blocked users
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the number of blocked users card
    When I am on the number of blocked users page
    And I click on the search icon
    And I click the column search for users
    And I input "colin" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "colin"

  @MU25
  #Sukses mencari nama dari jumlah pengguna yang dmute
  Scenario: As an admin, I want to be able to search for a name from a list of the number of muted users
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    When I am on the dashboard page
    And I click manage user icon on the side bar
    When I am on the manage user page
    And I click the card for the number of muted users
    When I am on the page for the number of muted users
    And I click on the search icon
    And I click the column search for users
    And I input "damon" in the search field
    And I hit enter on the keyboard
    Then I am seeing search results for "damon"