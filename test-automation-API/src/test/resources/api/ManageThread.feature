@Thread
Feature: ManageThread
  As a admin and user, I want to be able to manage thread.

  @T1
  #Create Thread +
  Scenario: POST As a user I can create a new thread
    Given I set POST api endpoints new thread
    When I send POST HTTP request new thread
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T2
  #Create Thread -
  Scenario: POST As a user I can't create new thread
    Given I set POST api endpoints new thread invalid
    When I send POST HTTP request new thread invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T3
  #Get All Thread +
  Scenario: GET As a user I can get all threads
    Given I set GET api endpoints all threads
    When I send GET HTTP request all threads
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T4
  #Get All Thread -
  Scenario: GET As a user I can't get all threads
    Given I set GET api endpoints all threads invalid
    When I send GET HTTP request all threads invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T5
  #Get Thread By ID +
  Scenario: GET As a user I can get thread by id
    Given I set GET api endpoints thread by id
    When I send GET HTTP request thread by id
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T6
  #Get Thread By ID -
  Scenario: GET As a user I can't get thread by id
    Given I set GET api endpoints thread by id invalid
    When I send GET HTTP request thread by id invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T7
  #Get Thread By Title +
  Scenario: GET As a user I can get thread by title
    Given I set GET api endpoints thread by title
    When I send GET HTTP request thread by title
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T8
  #Get Thread By Title -
  Scenario: GET As a user I can't get thread by title
    Given I set GET api endpoints thread by title invalid
    When I send GET HTTP request thread by title invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T9
  #Get Thread By Topic +
  Scenario: GET As a user I can get thread by topic
    Given I set GET api endpoints thread by topic
    When I send GET HTTP request thread by topic
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T10
  #Get Thread By Topic -
  Scenario: GET As a user I can't get thread by topic
    Given I set GET api endpoints thread by topic invalid
    When I send GET HTTP request thread by topic invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T11
  #Update Thread +
  Scenario: PUT As a user I can update thread
    Given I set PUT api endpoints update thread
    When I send PUT HTTP request update thread
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T12
  #Update Thread -
  Scenario: PUT As a user I can't update thread
    Given I set PUT api endpoints update thread invalid
    When I send PUT HTTP request update thread invalid
    Then I receive valid HTTP response code 500
    And I receive valid data for response code 500

  @T13
  #Delete Thread By ID +
  Scenario: DELETE As a user I can delete thread
    Given I set DELETE api endpoints delete thread
    When I send DELETE HTTP request delete thread
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T14
  #Delete Thread By ID -
  Scenario: DELETE As a user I can't delete thread
    Given I set DELETE api endpoints delete thread invalid
    When I send DELETE HTTP request delete thread invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T15
  #Create Bookmark +
  Scenario: POST As a user I can create a new bookmark
    Given I set POST api endpoints new bookmark
    When I send POST HTTP request new bookmark
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T16
  #Create Bookmark -
  Scenario: POST As a user I can't create new bookmark
    Given I set POST api endpoints new bookmark invalid
    When I send POST HTTP request new bookmark invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T17
  #Get All Bookmark +
  Scenario: GET As a user I can get all bookmarks
    Given I set GET api endpoints all bookmarks
    When I send GET HTTP request all bookmarks
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T18
  #Get All Bookmark -
  Scenario: GET As a user I can't get all bookmarks
    Given I set GET api endpoints all bookmarks invalid
    When I send GET HTTP request all bookmarks invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T19
  #Delete Bookmark By ID +
  Scenario: DELETE As a user I can delete bookmark
    Given I set DELETE api endpoints delete bookmark
    When I send DELETE HTTP request delete bookmark
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T20
  #Delete Bookmark By ID -
  Scenario: DELETE As a user I can't delete bookmark
    Given I set DELETE api endpoints delete bookmark invalid
    When I send DELETE HTTP request delete bookmark invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T21
  #Create Comment +
  Scenario: POST As a user I can create a new comment
    Given I set POST api endpoints new comment
    When I send POST HTTP request new comment
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T22
  #Create Comment -
  Scenario: POST As a user I can't create new comment
    Given I set POST api endpoints new comment invalid
    When I send POST HTTP request new comment invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T23
  #Get All Comment +
  Scenario: GET As a user I can get all comments
    Given I set GET api endpoints all comments
    When I send GET HTTP request all comments
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T24
  #Get All Comment -
  Scenario: GET As a user I can't get all comment
    Given I set GET api endpoints all comments invalid
    When I send GET HTTP request all comments invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T25
  #Get Comment By ID +
  Scenario: GET As a user I can get comment by id
    Given I set GET api endpoints comment by id
    When I send GET HTTP request comment by id
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T26
  #Get Comment By ID -
  Scenario: GET As a user I can't get comment by id
    Given I set GET api endpoints comment by id invalid
    When I send GET HTTP request comment by id invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T27
  #Update Comment +
  Scenario: PUT As a user I can update comment
    Given I set PUT api endpoints update comment
    When I send PUT HTTP request update comment
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T28
  #Update Comment -
  Scenario: PUT As a user I can't update comment
    Given I set PUT api endpoints update comment invalid
    When I send PUT HTTP request update comment invalid
    Then I receive valid HTTP response code 500
    And I receive valid data for response code 500

  @T29
  #Delete Comment By ID +
  Scenario: DELETE As a user I can delete comment by id
    Given I set DELETE api endpoints delete comment
    When I send DELETE HTTP request delete comment
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T30
  #Delete Comment By ID -
  Scenario: DELETE As a user I can't delete comment by id
    Given I set DELETE api endpoints delete comment invalid
    When I send DELETE HTTP request delete comment invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T31
  #Follow Certain +
  Scenario: POST As a user I can follow thread
    Given I set POST api endpoints follow thread
    When I send POST HTTP request follow thread
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T32
  #Follow Certain -
  Scenario: POST As a user I can't follow thread
    Given I set POST api endpoints follow thread invalid
    When I send POST HTTP request follow thread invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T33
  #Unfollow +
  Scenario: POST As a user I can unfollow thread
    Given I set POST api endpoints unfollow thread
    When I send POST HTTP request unfollow thread
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T34
  #Unfollow -
  Scenario: POST As a user I can't unfollow thread
    Given I set POST api endpoints unfollow thread invalid
    When I send POST HTTP request unfollow thread invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T35
  #Get All User +
  Scenario: GET As a user I can get all users
    Given I set GET api endpoints all users
    When I send GET HTTP request all users
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T36
  #Get All User -
  Scenario: GET As a user I can't get all users
    Given I set GET api endpoints all users invalid
    When I send GET HTTP request all users invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  #Post Images +
#  Scenario: POST As a user I can upload images
#    Given I set POST api endpoints images
#    When I send POST HTTP request images
#    Then I receive valid HTTP response code 200
#    And I receive valid data for response code 200
  #Post Images -
#  Scenario: POST As a user I can't upload images
#    Given I set POST api endpoints images invalid
#    When I send POST HTTP request images invalid
#    Then I receive valid HTTP response code 404
#    And I receive valid data for response code 404

  @T37
  #Get All Threads +
  Scenario: GET As an admin I can get all threads
    Given I set GET api endpoints all threads by admin
    When I send GET HTTP request all threads by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T38
  #Get All Threads -
  Scenario: GET As an user I can't get all threads
    Given I set GET api endpoints all threads by admin
    When I send GET HTTP request all threads invalid by admin
    Then I receive valid HTTP response code 400
    And I receive valid data for response code 400

  @T39
  #Get Thread By Title +
  Scenario: GET As an admin I can get thread by title
    Given I set GET api endpoints thread by title
    When I send GET HTTP request thread by title
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T40
  #Get Thread By Title -
  Scenario: GET As an admin I can't get thread by title
    Given I set GET api endpoints thread by title invalid
    When I send GET HTTP request thread by title invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T41
  #Get Threads By Topic +
  Scenario: GET As an user I can get thread by topic
    Given I set GET api endpoints thread by topic
    When I send GET HTTP request thread by topic
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T42
  #Get Threads By Topic -
  Scenario: GET As an user I can't get thread by topic
    Given I set GET api endpoints thread by topic invalid
    When I send GET HTTP request thread by topic invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404

  @T43
  #Update Thread By Admin +
  Scenario: PUT As an admin I can update thread
    Given I set PUT api endpoints update thread by admin
    When I send PUT HTTP request update thread by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T44
  #Update Thread By Admin -
  Scenario: PUT As an admin I can't update thread
    Given I set PUT api endpoints update thread invalid
    When I send PUT HTTP request update thread invalid
    Then I receive valid HTTP response code 500
    And I receive valid data for response code 500

  @T45
  #Delete Thread By Admin -
  Scenario: DELETE As an user I can delete thread
    Given I set DELETE api endpoints delete thread by admin
    When I send DELETE HTTP request delete thread by admin
    Then I receive valid HTTP response code 200
    And I receive valid data for response code 200
  @T46
  #Delete Thread By Admin -
  Scenario: DELETE As an user I can't delete thread
    Given I set DELETE api endpoints delete thread invalid
    When I send DELETE HTTP request delete thread invalid
    Then I receive valid HTTP response code 404
    And I receive valid data for response code 404