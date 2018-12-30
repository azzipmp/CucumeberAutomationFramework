Feature: Testing Mercury flight Project functionality
	
Scenario: Testing the Register link
Given Navigate to the flight application
When I click on register link	
Then Register page should display
And Close the browser



Scenario Outline: Testing the user Registration
Given Navigate to the flight application
When I click on register link
And Enter "<username>" ,"<password>" and "<confirmPassword>"
And Click on submit button
Then I verify the "<username>" created sucessfully
And Close the browser

Examples:
   	  | username  |password | confirmPassword |
  		| test123   |  test   | test            |
   	  |test789    |cucumber |cucumber         |