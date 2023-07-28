@login
Feature: Login
  In order to maintain employees data
  As a user
  I would like to access the OrangeHRM portal

  Background: 
    Given I have browser with OrangeHRM application

  @smoke @valid
  Scenario: Valid Login
    When I enter username as 'Admin'
    And I enter password as 'admin123'
    And I click on login
    Then I should get access to the dashboard with 'Quick Launch' section

  @invalid
  Scenario Outline: Invalid Login
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should not get access to portal with error as '<expected_error>'

    Examples: 
      | username | password | expected_error      |
      | saul     | saul123  | Invalid credentials |
      | kim      | kim123   | Invalid credentials |
