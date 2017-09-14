@tag
Feature: Create Account Negative tests
	Ensure that I get the correct errors when creating a new account.

@tag1
Scenario Outline: Correct errors when creating a new account
	Given User is on Create New Mendeley Account
	When User enters "<email>" into the email field
	And User enters "<firstName>" into the first name field
	And User enters "<lastName>" into the last name field
	And User enters "<password>" into the password field
	Then Message displayed is "<theErrorMessage>"
             
 Examples:
	| email               | firstName | lastName | password    | theErrorMessage                         |
	|                     | Clive     | Good     | password123 | Email is required.                      |
 	| clive.hood          | Clive     | Good     | password123 | Not a valid email. Take a closer look.  |
 	| clive.hood          | Clive     | Good     | password123 | Not a valid gmail. Take a closer look.  |
 	| clive.good@mail.com |           | Good     | password123 | First name is required.                 |
 	| clive.good@mail.com | Clive     |          | password123 | Last name is required.                  |
 	| clive.good@mail.com | Clive     | Good     |             | Password is required.                   |
 	| clive.good@mail.com | Clive     | Good     | P23456      | Password must be at least 7 characters. |
 