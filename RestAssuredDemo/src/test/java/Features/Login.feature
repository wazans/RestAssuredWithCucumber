@login
Feature: User_Info_API

  Scenario: launch chrome with valid URL
    Given I have launched chrome
    When I have entered the correct URL
    Then I should be successfully on the home screen
    
    
