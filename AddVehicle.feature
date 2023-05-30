@smoke
Feature: F01_addVehicle | validate request
  Scenario: validate that sys navigate to add vehicle
    Given user click on login button in initial page
    When user enter valid email
    And user enter correct password
    And user click on login btn
    Then sys should navigate to home page
    When user click on request field
    And  user click on add a Vehicle request
    Then sys should navigate to add vehicle page

  Scenario: validate that user can add Vehicle correctly
    Given user click on login button in initial page
    When user enter valid email
    And user enter correct password
    And user click on login btn
    Then sys should navigate to home page
    When user click on request field
    When user click on add a Vehicle request
    When user click the effective date drop down
    And user select effective date drop down option
    And user enter year
    When user enter make
    And user enter model
    And user enter VIN number
    And user enter coverage requested
    And click submit

  Scenario: validate that history is updated with add Vehicle request
    Given user click on login button in initial page
    When user enter valid email
    And user enter correct password
    And user click on login btn
    Then sys should navigate to home page
    When user click on request field
    Then sys should navigate to requests page
    When click on history
    Then validate that add vehicle is added in history