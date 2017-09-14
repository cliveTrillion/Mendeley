@tag
Feature: Create Account
	Create a new account

@tag1
Scenario: Create a new account
Given User does not have a Mendeley Account
	And User is on Create New Mendeley Account
When Complete all of the required personal details
	And Select a field of study and academic status
	And Create account
Then I expect to see a Welcome to your Mendeley Library message
