Feature: Test Automation Rest API

  @web
  Scenario: Test web login normal
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then validation users can show side nav "Admin"

  @web
  Scenario: Test search sidenav positive
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    And user search sidenav "Buzz"

  @web
  Scenario: Test web login negative
    Given user go to login page
    And user input username "Admins"
    And user input pwd "admin1234"
    And user click button login
#    Then validation input invalid "Invalid credentials"