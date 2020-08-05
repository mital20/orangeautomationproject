Feature: Login panel
Background: user is on login page
@test
  Scenario: User should login successfully with valid credentials

    When User enters valid username and valid password
    And User click on login button
    Then user has login successfully

  Scenario Outline: User should not login with invalid credentials

    When User enters invalid "<Username>" and  invalid "<password>"
    And User click on login button
    Then user sees error "<message>"
    Examples:
      | Username | password | message                  |
      | Admin    |          | Password cannot be empty |
      |          | admin123 | Username cannot be empty |
      | mital    | mital123 | Invalid credentials      |
      | Admin    | raj123   | Invalid credentials      |
      | Raj      | admin123 | Invalid credentials      |





