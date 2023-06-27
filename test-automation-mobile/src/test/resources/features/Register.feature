@Register
Feature: As a user i have be able to register a new account

  @RegisterNewUser
  Scenario: As a user i can register
    Given user at the landing page
    When user click skip button
    And user click next button
    And user click register
    And user input username
    And user input email and phone number fill
    And user input password fill
    And user input age
    And user click register button
    Then user success to create new account

  @RegisterWithoutInputData
  Scenario: As a user i cant register due to the input data is not filled
    Given user at the landing page2
    When user click skip button2
    And user click next button2
    And user click register2
    And user click register button2
    Then user failed to create new account2

  @RegisterWithoutUsername
  Scenario: As a user i cant register without username
    Given user at the landing page3
    When user click skip button3
    And user click next button3
    And user click register3
    And user input email and phone number fill3
    And user input password fill3
    And user input age3
    And user click register button3
    Then user failed to create new account3

  @RegisterWithoutEmail
  Scenario: As a user i cant register without email
    Given user at the landing page4
    When user click skip button4
    And user click next button4
    And user click register4
    And user input username4
    And user input password fill4
    And user input age4
    And user click register button4
    Then user failed to create new account4

  @RegisterWithoutPassword
  Scenario: As a user i cant register without password
    Given user at the landing page5
    When user click skip button5
    And user click next button5
    And user click register5
    And user input username5
    And user input email and phone number fill5
    And user input age5
    And user click register button5
    Then user failed to create new account5

  @RegisterWithoutAge
  Scenario: As a user i cant register without age
    Given user at the landing page6
    When user click skip button6
    And user click next button6
    And user click register6
    And user input username6
    And user input email and phone number fill6
    And user input password fill6
    And user click register button6
    Then user failed to create new account6


  @RegisterWithRegisteredEmailorNumberPhone
  Scenario: As a user i cant register due to the registered email or number phone
    Given user at the landing page8
    When user click skip button8
    And user click next button8
    And user click register8
    And user input username8
    And user input registered email and phone number fill8
    And user input password fill8
    And user input age8
    And user click register button8
    Then user failed to create new account8
