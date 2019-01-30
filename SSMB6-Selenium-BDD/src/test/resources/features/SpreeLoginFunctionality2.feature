Feature: Spree login functionality 2
  This explain how verious login functionality will work
  Only valid user should be able to login
  1. Valid user with valid password can login
  2. Invalid user or invalid password can not login
  
 @Aceptance 
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
	  
 @Aceptance 
 @Functional	  
 Scenario: 2.Valid user with invalid password
	  Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "shiftqa1@gmail.com"
	  And User enter password as "invalid"
	  And User click login button
	  Then Browser display Login page
	  And Login not success message display
 
 @Functional	  
 Scenario: 3.InValid user with valid password
	  Given Not a validated user
	  When User browse to the site
	  Then Spree home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "shiftqa1XXX@gmail.com"
	  And User enter password as "shiftedtech"
	  And User click login button
	  Then Browser display Login page
	  And Login not success message display