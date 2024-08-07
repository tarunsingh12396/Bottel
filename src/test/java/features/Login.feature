Feature:  login functionality



@smoke
Scenario: verify the login functionality


When  user enter correct "test" and "automation"

And  user click on login button

Then  user navigate to home page

@smoke2
Scenario Outline: verify the login functionality


When  user enter correct "username" and "password"

And  user click on login button

Then  user navigate to home page


Examples:

|username||password|
|user1||pass2|
|user2||pass2|
|user3||pass3|







