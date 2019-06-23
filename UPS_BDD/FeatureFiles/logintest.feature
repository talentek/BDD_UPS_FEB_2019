Feature: Ups Login Feature
  This login feature is for login functionality in UPS website

  Scenario Outline: Login with wrong user id and password
    Given I navigated to ups login page
    When I entered wrong "<userid>" and "<password>"
    And I click on login
    Then I should receive an error message

    Examples: 
      | userid     | password     |
      | user1      | password1    |
      | user2      | password2    |
      | juel       | helloworld   |
      
 Scenario: Login with correct user id and password
    Given I navigated to ups login page
    When I entered correct "userid" and "password"
    And I click on login
    Then I should be able to login
      


  
  