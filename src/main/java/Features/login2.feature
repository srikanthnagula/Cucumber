Feature: Free CRM Login Feature with example keyword data driven

Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login page
When Title of login page is Free CRM
Then User Clicks on Login Button
Then User enters "<Username>" and "<password>"
Then User clicks on Login
Then Title of Homepage is CRM

 Examples: 
 	| Username | password |
 	| srikanth04@gmail.com | India123$ |