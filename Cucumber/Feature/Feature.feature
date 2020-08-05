Feature: verify login page

Background: 
Given user launch the browser and amazon application

Scenario Outline: login
When user enter "<username>" and "<password>"
Then user click the login button
Then user verify the homepage

Examples:
| username | password |
| sid 		 | 5646 		|
| here		 | 5578			|


Scenario: verify the forgot password
When user enter password
Then user clicks forgot password
Then user reset password

