@Login
Feature: Login
  As a user
  I want to login and see the dashboard
  So that I can buy some products

  @L1
  #Sukses login
  Scenario: As an admin, I want to login successfully
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "adminqe123" on password field
    And I click login button
    Then I am on the dashboard page

  @L2
  #Gagal login karena tidak mengisi email
  Scenario: As an admin, I can't login because I didn't fill in my email
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "" on email field
    And I input password "adminqe123" on password field
    And I click login button
    Then I see error message "Tolong masukkan email"

  @L3
  #Gagal login karena tidak mengisi password
  Scenario: As an admin, I can't log in because I didn't fill in the password
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adminqe@gmail.com" on email field
    And I input password "" on password field
    And I click login button
    Then I see error message "Tolong masukkan kata sandi"

  @L4
  #Gagal login karena tidak mengisi email dan password
  Scenario: As an admin, I can't login because I didn't fill in my email and password
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "" on email field
    And I input password "" on password field
    And I click login button
    And I see error message "Tolong masukkan email"
    Then I see error message "Tolong masukkan kata sandi"

  @L5
  #Gagal login karena email atau password salah
  Scenario: As an admin, I can't login because my email or password is invalid
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "nafaladi1@gmail.com" on email field
    And I input password "nafal123" on password field
    And I click login button
    And I see error message "Email yang anda masukkan salah"
    Then I see error message "Kata sandi yang anda masukkan salah"

  @L6
  #Gagal login karena email atau password belum terdaftar
  Scenario: As an admin, I can't log in because my email and password haven't been registered
    Given I am on the landing page
    And I click masuk button
    When I am on the login page
    And I input email "adi@gmail.com" on email field
    And I input password "nafal123" on password field
    And I click login button
    And I see error message "Email yang anda masukkan salah"
    Then I see error message "Kata sandi yang anda masukkan salah"