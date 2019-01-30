Feature: Spree login functionality
         This explain how verious login functionality will work
         Only valid user should be able to login



Scenario: 1.Valid user with valid password 
    Given Not a validated user 
    When User browse to the site 
    Then Spree home page should display 
    When User click login link 
    Then Browser display Login page 
    When User enter user email as "shiftqa1@gmail.com"
    And User enter password as "shiftedtech"
    And User click login button 
    Then Home page should display 
    And Login success message display

Scenario: 2.Invalid user with Invalid password 
    Given Not a validated user
    When User browse to the site
    Then Spree home page should display
    When User click login link
    Then Browser display Login page
    When User enter user email as "shiftqa1@gmail.com"
    And User enter password as "shiftedtechxxx"
    And User click login button
    Then Browser display Login page
    And Login fail message display

Scenario Outline: 3.Valid user with valid password Data Driven
    Given Not a validated user
    When User browse to the site
    Then Spree home page should display
    When User click login link
    Then Browser display Login page
    When User enter user email as "<EmailAddress>"
    And User enter password as "<Password>"
    And User click login button
    Then Home page should display
    And Login success message display

Examples:
    |EmailAddress                |Password    |
    |shiftqa1@gmail.com          |shiftedtech |
    |tc001@gmail.com             | 000000    |