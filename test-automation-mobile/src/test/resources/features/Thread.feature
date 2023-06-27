@Thread
Feature: As a user i have be able to create, read, update, delete a thread

  @ViewAllThread
  Scenario: As a user i can view all threads
    Given user in the landing page
    When user can click skip
    And user can click next
    And user can input email or phone number
    And user can input password
    And user can click login button
    Then user can view all thread

    @CreateThread
    Scenario: As a user i can create a thread
      Given user in the landing page2
      When user can click skip2
      And user can click next2
      And user can input email or phone number2
      And user can input password2
      And user can click login button2
      And user can see home page2
      And user tap create thread2
      And user input tittle2
      And user input topic2
      And user click send button2
      Then user can see their new thread2

    @CreateThreadWithoutFill
    Scenario: As a user i cant create a thread due to thread is not filled
      Given user in the landing page3
      When user can click skip3
      And user can click next3
      And user can input email or phone number3
      And user can input password3
      And user can click login button3
      And user can see home page3
      And user tap create thread3
      And user click send button3
      Then user cant create thread and see error message3

    @CreateThreadWithAddMedia
    Scenario: As a user i can create a thread with media
      Given user in the landing page4
      When user can click skip4
      And user can click next4
      And user can input email or phone number4
      And user can input password4
      And user can click login button4
      And user can see home page4
      And user tap create thread4
      And user input tittle4
      And user input topic4
      And user add media4
      And user click send button4
      Then user can see their new thread4

    @SearchTittleThread
    Scenario: As a user i can search thread by tittle
      Given user in the landing page5
      When user can click skip5
      And user can click next5
      And user can input email or phone number5
      And user can input password5
      And user can click login button5
      And user can see home page5
      And user can click searchbar5
      And user input tittle thread5
      Then user can see the thread5

    @ViewMonthlyThreadsLeaderboard
    Scenario: As a user i can see leaderboard thread by monthly
      Given user in the landing page6
      When user can click skip6
      And user can click next6
      And user can input email or phone number6
      And user can input password6
      And user can click login button6
      And user can see home page6
      And user click leaderboard page6
      And user click monthly6
      Then user can see leaderboard by monthly6

    @ViewWeeklyThreadsLeaderboard
    Scenario: As a user i can see leaderboard thread by Weekly
      Given user in the landing page7
      When user can click skip7
      And user can click next7
      And user can input email or phone number7
      And user can input password7
      And user can click login button7
      And user can see home page7
      And user click leaderboard page7
      And user click weekly7
      Then user can see leaderboard by weekly7

    @LikeOtherThread
    Scenario: As a user i can like other thread
      Given user in the landing page8
      When user can click skip8
      And user can click next8
      And user can input email or phone number8
      And user can input password8
      And user can click login button8
      And user can view all thread8
      And user click like button8
      Then user can liked a thread8

    @CommentOtherThread
    Scenario: As a user i can comment other thread
      Given user in the landing page9
      When user can click skip9
      And user can click next9
      And user can input email or phone number9
      And user can input password9
      And user can click login button9
      And user can view all thread9
      And user click comment button9
      And user can input comment9
      And user click send comment button9
      Then user success to comment9

    @CommentOtherThreadWithoutFill
    Scenario: As a user i cant comment other thread without fill comment
      Given user in the landing page10
      When user can click skip10
      And user can click next10
      And user can input email or phone number10
      And user can input password10
      And user can click login button10
      And user can view all thread10
      And user click comment button10
      And user can input comment10
      And user click send comment button10
      Then user failed to comment10

  @CommentOtherThreadWithoutFill
  Scenario: As a user i cant comment other thread without fill comment
    Given user in the landing page10
    When user can click skip10
    And user can click next10
    And user can input email or phone number10
    And user can input password10
    And user can click login button10
    And user can view all thread10
    And user click comment button10
    And user can input comment10
    And user click send comment button10
    Then user failed to comment10

    @FollowOtherThread
    Scenario: As a user i can follow other thread
      Given user in the landing page11
      When user can click skip11
      And user can click next11
      And user can input email or phone number11
      And user can input password11
      And user can click login button11
      And user can view all thread11
      And user click thread menu11
      And user click follow thread11
      Then user success to follow thread11

    @FollowOtherUser
    Scenario: As a user i can follow other user
      Given user in the landing page12
      When user can click skip12
      And user can click next12
      And user can input email or phone number12
      And user can input password12
      And user can click login button12
      And user can view all thread12
      And user can click follow user12
      Then user success to follow other user12

    @AddThreadToBookmark
    Scenario: As a user i can add a threads bookmark
      Given user in the landing page13
      When user can click skip13
      And user can click next13
      And user can input email or phone number13
      And user can input password13
      And user can click login button13
      And user can see home page13
      And user click thread menu13
      And user click add to bookmark13
      Then user success to add thread to bookmark13

    @ViewThreadsBookmark
    Scenario: As a user i can see a threads bookmark
      Given user in the landing page14
      When user can click skip14
      And user can click next14
      And user can input email or phone number14
      And user can input password14
      And user can click login button14
      And user can see home page14
      And user click profile page14
      And user clik profile menu14
      And user click bookmarks14
      Then user success to see bookmark threads
