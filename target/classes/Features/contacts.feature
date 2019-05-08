Feature: Free CRM create contacts

Scenario Outline:  Create new contact Scenario

Given User is already on Login page
When Title of login page is Free CRM
Then User Clicks on Login Button
Then User enters "<Username>" and "<password>"
Then User clicks on Login
Then Title of Homepage is CRM
Then User moved to new contact page
Then User enters Contact details "<Firstname>" and "<Lastname>" and "<Postion>"
Then Close the browser

Examples:
	| Username | password | Firstname | Lastname | Postion |
	| srikanth04@gmail.com | India123$ | Fname 1 | LName 1 | Position 1 |
	#| srikanth04@gmail.com | India123$ | Fname 2 | LName 2 | Position 2 |
	#| srikanth04@gmail.com | India123$ | Fname 3 | LName 3 | Position 3 |
	#| srikanth04@gmail.com | India123$ | Fname 4 | LName 4 | Position 4 |
	#| srikanth04@gmail.com | India123$ | Fname 5 | LName 5 | Position 5 |