Feature: Happy flow with standard user2 and perfomrence user

Scenario Outline: End to end flow
Scenario: end to end flow satnderd2
Given user is on login page
When user enters username "<username>"
And user enters password "secret_sauce"
And user clicks on Login button
And user added the product "Sauce Labs Backpack" to cart
And user the validated "Sauce Labs Backpack" amount "29.99" as price
And user validated the product count as "1" in basket
And user is in cart page 
And user validated product name as "Sauce Labs Backpack" in cart
And user check out the product 
And "Fname","Lname","1234" as input
And user click on continue
And user validated the ammount "32.39" as total
Then user click on Finish 
Then user click on back to home
   

    Examples:
      | username               |
      | standard_user          | 
      | performance_glitch_user| 
