Feature: Use the websites to find restaurants
				So that i can order food
				As a hungry customer
				I want to be able to find restuarants in my area
@tag1				
Scenario: Search for restaurants in an area
		Given I want food in "AR51 1AA"
		When I search for restaurants
		Then I should see some restaurants in "AR51 1AA"
		
@tag2
Scenario: Search base on the cuisine
		Given I want food in "AR51 1AA"
		When I search for specific cuisine as "Burger"
		Then I should see some restaurants in "AR51 1AA"
		