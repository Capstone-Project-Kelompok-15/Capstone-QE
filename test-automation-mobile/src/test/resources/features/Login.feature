@login
Feature: As a user i have be able to login so that i can see home

  @LoginSuccess
  Scenario: As a user i can login
    Given user on landing page
    When user click skip
    And user click next
    And user input email or phone number
    And user input password
    And user click login button
    Then user can see home page

  @LoginWithWrongPass
  Scenario: As a user i cant login due to the wrong password
    Given user on landing page2
    When user click skip2
    And user click next2
    And user input email or phone number2
    And user input wrong password2
    And user click login button2
    Then user cant login and see error message2

  @LoginWithUnregisteredAcc
  Scenario: As a user i cant login due to the unregistered account
    Given user on landing page3
    When user click skip3
    And user click next3
    And user input invalid email or phone number3
    And user input invalid password3
    And user click login button3
    Then user cant login and see error message3

  @LoginWithoutFilledEmailAndPass
  Scenario: As a user i cant login due to the not filled email and password
    Given user on landing page4
    When user click skip4
    And user click next4
    And user click login button4
    Then user cant login and see error message4

  @LoginWithoutEmail
  Scenario: As a user i cant login due to the not filled email
    Given user on landing page5
    When user click skip5
    And user click next5
    And user input password5
    And user click login button5
    Then user cant login and see error message5


  @LoginWithoutPassword
  Scenario: As a user i cant login due to the not filled password
    Given user on landing page6
    When user click skip6
    And user click next6
    And user input email or phone number6
    And user click login button6
    Then user cant login and see error message6
