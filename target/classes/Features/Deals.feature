Feature: Deals Data Creation
Scenario: Free CRM New Deals Scenario
Given User is in new Deals login page
When User enters Username and Password
| srikanth04@gmail.com | India123$ |  
Then User click on login button
Then User enters deal details 
| Test deal | 1000 | 50 | 10 |
