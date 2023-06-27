@Ikuti
Feature: As a user i have be able to view all followed thread and user

  @ViewAllFollowedThreadsByuser
  Scenario: As a user i can see followed thread by user
    Given user in the landing pageIkt
    When user can click skipIkt
    And user can click nextFIkt
    And user can input email or phone numberIkt
    And user can input passwordIkt
    And user can click login buttonIkt
    And user can see home pageikt
    And user click ikuti pageIkt
    And user click ikuti pengguna
    Then user can see thread by ikuti pengguna

  @ViewAllThreadsByFollowed
  Scenario: As a user i can see followed thread
    Given user in the landing pageIkt2
    When user can click skipIkt2
    And user can click nextFIkt2
    And user can input email or phone numberIkt2
    And user can input passwordIkt2
    And user can click login buttonIkt2
    And user can see home pageikt2
    And user click ikuti pageIkt2
    And user click ikuti postingan2
    Then user can see thread by ikuti postingan2
