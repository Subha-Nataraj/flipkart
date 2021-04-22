Feature: Adactin hotel reservation login page validation
Scenario: validate the login with the valid credentials
Given Launch the Web Application
When Enter the UserName as "SubhaNataraj" PassWord as "Su38a9943"
And Click the login button
Then get the nextpage title for a successfull logins
