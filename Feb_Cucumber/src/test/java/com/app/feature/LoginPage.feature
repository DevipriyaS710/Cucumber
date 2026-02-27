Feature: Validate the login page

Background:
  Given Login to the URL "https://adactinhotelapp.com/"

	@smoke1
  Scenario: Validate the valid username and password
    When Enter the username "Yuvaraj"
    And Enter the password "adjhsfdhsdvfsdb"
    And Click the login button
    Then Validate the Home page
	@smoke
  Scenario: Validate the invalid username and password
    When Enter the username "Yuwerwevaraj"
    And Enter the pswdd "adjhssfwfweffdhsdvfsdb"
    And Click the login button
    Then Validate the Home page
