Feature: Validate Home Page

@scenario_fb
Scenario: Validate User Name and Password
Given Enter the facebook URL("Www.Facebook.com")
When Enter the user name "DeviPriya"
And Enter the Password "12345" 
And Click the login button
Then Validate the login page