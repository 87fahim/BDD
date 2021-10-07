Feature: Validate Techfios login functionality

Background:
	Given User in on the login page  
@Scenario @Login
Scenario Outline: 1 User should be able to login with valid credentials
	When User enters username as "<email>" and "<password>" and "<valid>"
	And user click on the login button 
	Then User should be on Dashboard page 
	Examples: 
		|       email        | password | valid |
		| demo@techfios.com  |  abc123  | true	|
		| demo@techfios.com  |  abc124  | false	|
		| demo3@techfios.com |  abc123  | false	|
		| demo4@techfios.com |  abc124  | false	|
	
  