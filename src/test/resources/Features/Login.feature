Feature: Login Page automation

  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When user enter valid username as "standard_user" and password as "secret_sauce"
    And click on login page
    Then user should be navigated on home page
    And close browser

  Scenario: Check login is successful with valid credentials with step data
    Given User is on login page
    When user enter valid username and password
      | standard_user | secret_sauce |
    And click on login page
    Then user should be navigated on home page
    And close browser

  Scenario Outline: Check login with multiple username is successful with valid credentials
    Given User is on login page
    When user enter valid "<username>" and "<password>"
    And click on login page
    And close browser
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
