Feature: Testing Mercury flight Project functionality
	
Scenario: Testing the Flight booking
Given Navigate to the flight application
When I click on register link	
And Register the user
And book the flight
Then flight book sucess
