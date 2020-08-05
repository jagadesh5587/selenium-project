Feature:  Login and Purchase in AutomationProcess App

Background: 
Given user launch the AutomationPractice Application

Scenario Outline: Login
When user click the sign-in
When user enter "<username>" and "<password>"
Then click the sign in button
And enter search item
Then click submit button
Then close the browser 

Examples: 
| username 				        | password    |
| sudha.cluster@gmail.com | Sidhere24$$ |

