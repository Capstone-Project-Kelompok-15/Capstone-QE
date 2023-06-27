Feature: PerformBlockMute
  As an admin, I want to be able to block and mute user.

  @PBM1
  #Mute +
  Scenario: POST As an admin I can mute user
    Given I set POST api endpoints mute user
    When I send POST HTTP request mute user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @PBM2
  #Mute -
  Scenario: POST As an admin I can't mute user
    Given I set POST api endpoints mute user invalid
    When I send POST HTTP request mute user invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @PBM3
  #Unmute +
  Scenario: POST As an admin I can unmute user
    Given I set POST api endpoints unmute user
    When I send POST HTTP request unmute user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @PBM4
  #Unmute -
  Scenario: POST As an admin I can't unmute user
    Given I set POST api endpoints unmute user invalid
    When I send POST HTTP request unmute user invalid
    Then I receive valid HTTP response code 500
    And I receive valid data for response code 500

  @PBM5
  #Block +
  Scenario: POST As an admin I can block user
    Given I set POST api endpoints block user
    When I send POST HTTP request block user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @PBM6
  #Block -
  Scenario: POST As an admin I can't block user
    Given I set POST api endpoints block user invalid
    When I send POST HTTP request block user invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @PBM7
  #Unblock +
  Scenario: POST As an admin I can unblock user
    Given I set POST api endpoints unblock user
    When I send POST HTTP request unblock user
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @PBM8
  #Unblock -
  Scenario: POST As an admin I can't unblock user
    Given I set POST api endpoints unblock user invalid
    When I send POST HTTP request unblock user invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404