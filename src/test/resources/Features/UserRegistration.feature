Feature: User Registration

  Background:
    Given the following users exist:
      | username | email             | password    |
      | user1    | user1@example.com | password1  |
      | user2    | user2@example.com | password2  |

  Scenario: Successful user registration
    When I open the registration page
    And I fill in the registration form with:
      | username | email             | password    |
      | newuser  | newuser@example.com | newpassword |
    And I submit the registration form
    Then I should see a success message

  Scenario: Registration with an existing username
    When I open the registration page
    And I fill in the registration form with:
      | username | email             | password    |
      | user1    | user3@example.com | password3  |
    And I submit the registration form
    Then I should see an error message