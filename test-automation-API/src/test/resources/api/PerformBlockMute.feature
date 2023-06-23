#Feature: PerformBlockMute
#  As an admin, I want to be able to manage user.

  #Get all user online +
#  Scenario: POST As an admin I can get all user online
#    Given I set GET api endpoints get all user online
#    When I send GET HTTP request all user online
#    Then I receive valid HTTP response code 200
#    And I receive valid data for register user
  #get all user online -
#  Scenario: POST As an admin I can't get all user online
#    Given I set GET api endpoints all user online
#    When I send GET HTTP request all user online invalid
#    Then I receive valid HTTP response code 400
#    And I receive valid data for response code 400

  #Get all user bloked +
#  Scenario: POST As an admin I can get all user bloked
#    Given I set GET api endpoints get all user bloked
#    When I send GET HTTP request all user bloked
#    Then I receive valid HTTP response code 200
#    And I receive valid data for register user
  #get all user bloked -
#  Scenario: POST As an admin I can't get all user bloked
#    Given I set GET api endpoints all user bloked
#    When I send GET HTTP request all user bloked invalid
#    Then I receive valid HTTP response code 400
#    And I receive valid data for response code 400

  #Get all user muted +
#  Scenario: POST As an admin I can get all user muted
#    Given I set GET api endpoints get all user muted
#    When I send GET HTTP request all user muted
#    Then I receive valid HTTP response code 200
#    And I receive valid data for register user
  #get all user muted -
#  Scenario: POST As an admin I can't get all user muted
#    Given I set GET api endpoints all user muted
#    When I send GET HTTP request all user muted invalid
#    Then I receive valid HTTP response code 400
#    And I receive valid data for response code 400