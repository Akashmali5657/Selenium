Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given open Login Page
    When title of login page is Free CRM
    And user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is on home page
    And user moves to new contact page
    And user enters contact details "<firstname>" and "<lastname>" and "<position>"
    And Close the browser

    Examples:
      | username | password | firstname | lastname | position |
      | naveenk  | test@123 | Tom       | Peter    | Manager  |
      | naveenk  | test@123 | David     | Dsouza   | Director |