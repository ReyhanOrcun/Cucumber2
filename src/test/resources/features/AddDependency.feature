#Author:Reyhan/BugExterminators

@dependency
Feature: Add Dependency
  I want to test the Add Dependency Functionality
  
  
  Background: 
    Given user is logged in with valid credentials
    And Admin navigates to Personal Details Page

  @dependency1
  Scenario: Navigate to Dependents Page
    When User clicks more
    And User Selects Dependents from drop down options
    Then user should see Assigned Dependents page

  @dependency2
  Scenario Outline: Add and Modify Dependents
    Given Navigate ADD DEPENDENT Frame
    When user enter name "<Name>"
    And user selects "<DOB>"
    And user selects "<relationship>" from dropdown
    And user clicks save button
    Then I am able to see 'Successfully saved' message

    Examples: 
      | Name     | DOB              | relationship |
      | Cin Ali  | Wed, 18 Mar 1987 | Child        |
      | Keloglan | Thu, 06 Mar 1952 | Father       |
