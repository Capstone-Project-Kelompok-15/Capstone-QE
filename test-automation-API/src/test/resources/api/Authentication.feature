@Authentication
Feature: Authentication
  As a user, I want to be able to register, login, and get user info.

  @PostRegister+
  Scenario: POST As a user I can register
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 200
    And I receive valid data for register
  @PostRegister-
  Scenario: POST As a user I can't register
    Given I set POST api endpoints register invalid
    When I send POST HTTP request register invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @PostLogin+
  Scenario: POST As a user I can login
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200
    And I receive valid data for login
  @PostLogin-
  Scenario: POST As a user I can't login
    Given I set POST api endpoints login
    When I send POST HTTP request login invalid
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400 login

  @GetUserInfo+
  Scenario: GET As a user I can get user info
    Given I set GET api endpoints user info
    When I send GET HTTP request user info
    Then I receive valid HTTP response code 200
    And I receive valid data for user info
  @GetUserInfo-
  Scenario: GET As a user I can't get user info
    Given I set GET api endpoints user info
    When I send GET HTTP request user info invalid
    Then I receive valid HTTP response code 401
    And I receive valid data for response code 401