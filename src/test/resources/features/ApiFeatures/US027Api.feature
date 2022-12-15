@Api_US_027
Feature:TestItems Api Test

  @US027_TC005_Get
  Scenario: US027_TC005 all test items api testing
    Given yp Admin set path params for test items
    And yp Admin enters expected data for test items
    And yp Admin sends request and get response for test items
    And yp Admin save all API information for test items
    And yp Admin verify API for test items

  @US027_TC005_Post
  Scenario: US027_TC006 create test items using api
    Given yp Admin set path params for test item creation
    And yp Admin enters expected data for test item creation
    And yp Admin sends request and get response for test item creation
    And yp Admin save all API information for test item creation
    And yp Admin verify API for test item creation
