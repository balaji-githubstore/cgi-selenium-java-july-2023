@employee
Feature: Employee
  In order to maintain employee details 
  As a admin
  I want to add,edit,delete employee records

  @addemployee
  Scenario Outline: Add Valid Employee
    Given I have browser with OrangeHRM application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    And I click on PIM menu
    And I click on Add Employee menu
    And I fill the new employee form
      | firstname | middlename   | lastname |
      | <fname>   | <middlename> | <lname>  |
    And I click on save
    Then I should see the profile name as '<expected_profile_name>'
    And I should verify the textbox firstname is 'Saul'
    Examples: 
      | username | password | fname | middlename | lname   | expected_profile_name |
      | Admin    | admin123 | saul  | g          | goodman | saul goodname         |
      | Admin    | admin123 | john  | g          | goodman | saul goodname         |
