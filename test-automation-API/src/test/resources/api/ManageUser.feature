@User
Feature: ManageUser
  As a user, I want to be able to manage user.

  @U1
  #Login User +
  Scenario: POST As a user I can login
    Given I set POST api endpoints login user
    When I send POST HTTP request login user
    Then I receive valid HTTP response code 200
    And I receive valid data for login user
  @U2
  #Login User -
  Scenario: POST As a user I can't login
    Given I set POST api endpoints login user
    When I send POST HTTP request login user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @U2
  #Register User +
  Scenario: POST As a user I can register
    Given I set POST api endpoints register user
    When I send POST HTTP request register user
    Then I receive valid HTTP response code 200
    And I receive valid data for register user
  @U4
  #Register User -
  Scenario: POST As a user I can't register
    Given I set POST api endpoints register user
    When I send POST HTTP request register user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @U5
  #Update User +
  Scenario: PUT As an admin I can update user data
    Given I set PUT api endpoints update user
    When I send PUT HTTP request update user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @U6
  #Update User -
  Scenario: PUT As an admin I can't update user data
    Given I set PUT api endpoints update user
    When I send PUT HTTP request update user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @U7
  #Get Detail User +
  Scenario: GET As an admin I can get detail user
    Given I set GET api endpoints user
    When I send GET HTTP request user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @U8
  #Get Detail User -
  Scenario: GET As an admin I can't get detail user
    Given I set GET api endpoints user
    When I send GET HTTP request user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @U9
  #Delete User +
  Scenario: DELETE As a user I can delete user
    Given I set DELETE api endpoints delete user
    When I send DELETE HTTP request delete user
    Then I receive valid HTTP response code 200
    And I receive valid data for delete user
  @U10
  #Delete User -
  Scenario: DELETE As a user I can't delete user
    Given I set DELETE api endpoints delete user invalid
    When I send DELETE HTTP request delete user invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400