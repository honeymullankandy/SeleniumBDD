Feature: Product page feature some extra flows


Scenario: Login with correct credentials
Given user is on login page
When user enters username "problem_user"
And user enters password "secret_sauce"
And user clicks on Login button
And user validate the menu of the product page




