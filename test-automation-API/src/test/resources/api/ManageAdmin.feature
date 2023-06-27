@Admin
Feature: ManageAdmin
  As a admin, I want to be able to manage admin.

  @A1
  #Login Admin +
  Scenario: POST As an admin I can login
    Given I set POST api endpoints login admin
    When I send POST HTTP request login admin
    Then I receive valid HTTP response code 200
    And I receive valid data for login admin
  @A2
  #Login Admin -
  Scenario: POST As an admin I can't login
    Given I set POST api endpoints login admin
    When I send POST HTTP request login admin invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @A3
  #Create User By Admin +
  Scenario: POST As an admin I can register user
    Given I set POST api endpoints register user
    When I send POST HTTP request register user
    Then I receive valid HTTP response code 200
    And I receive valid data for register user
  @A4
  #Create User By Admin -
  Scenario: POST As an admin I can't register user
    Given I set POST api endpoints register user
    When I send POST HTTP request register user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @A5
  #Update User By Admin +
  Scenario: PUT As an admin I can update user data
    Given I set PUT api endpoints update user by admin
    When I send PUT HTTP request update user by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @A6
  #Update User By Admin -
  Scenario: PUT As an admin I can't update user data
    Given I set PUT api endpoints update user invalid by admin
    When I send PUT HTTP request update user invalid by admin
    Then I receive valid HTTP response code 500
    And I receive valid data for response code 500
  @A7
  #Get All User +
  Scenario: GET As an admin I can get all user
    Given I set GET api endpoints all users by admin
    When I send GET HTTP request all users by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @A8
  #Get All User -
  Scenario: GET As an admin I can't get all user
    Given I set GET api endpoints all users invalid
    When I send GET HTTP request all users invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @A9
  #Delete User By Admin +
  Scenario: DELETE As an admin I can delete user
    Given I set DELETE api endpoints delete user by admin
    When I send DELETE HTTP request delete user by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @A10
  #Delete User By Admin -
  Scenario: DELETE As an admin I can't delete user
    Given I set DELETE api endpoints delete user invalid
    When I send DELETE HTTP request delete user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400