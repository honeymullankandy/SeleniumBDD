Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Swag Labs"

Scenario: Login with correct credentials
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Swag Labs"


Scenario: Login with locked user credentials
Given user is on login page
When user enters username "locked_out_user"
And user enters password "secret_sauce"
And user clicks on Login button
And user validate the error msg


Scenario: Login with standard_user and validate image will load correctly
Given user is on login page
When user enters username "standard_user"
And user enters password "secret_sauce"
And user clicks on Login button
Then user gets the title of the page
Then user validate the "sauce-backpack-1200x1500.0a0b85a3.jpg" is loaded correctly for "Sauce Labs Backpack"



Scenario: Login with problem_user and validate negative flow
Given user is on login page
When user enters username "problem_user"
And user enters password "secret_sauce"
And user clicks on Login button
Then user gets the title of the page
Then user validate the "sauce-backpack-1200x1500.0a0b85a3.jpg" is loaded correctly for "Sauce Labs Backpack"
