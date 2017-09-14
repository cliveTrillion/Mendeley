@tag
Feature: Existing Account Detection
	User has an existing account

@tag1
Scenario: Attempt to create a new account when one exists
Given User has a Mendeley Account
	And User is on Create New Mendeley Account
When User enters their into the email field
Then I expect to see the Elsevier account found, please go to Sign In message
