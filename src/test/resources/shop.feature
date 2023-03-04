Feature: Shop
	I want to test the shop page
	
	Scenario: Shop page
	   Given I am on the Asian paints website 
	   When I click on shop
	   Then I should navigate to the shop page

	Scenario: Wallstickers
	   Given I am on the shop page 
	   When I hover my mouse on Shop
		 And I should be able to select the wallstickers category
		 And I should be able to click on any wallsticker
		 Then I should see the details of selected wallsticker

	Scenario: Colour Selection Tools
	   Given I am on the shop page 
	   When I hover my mouse on Shop
		 And I select the Colour Selection Tools category
		 And I should be able to click on any selection tool
		 Then I should see the details of selected Colour selection tool

	Scenario: Adhesives
		 Given I am on the shop page 
	   When I hover my mouse on Shop
		 And I should be able to select the Adhesives category
		 Then I should see a list of all availble Adhesives

	Scenario: Shop Disney Stickers
	   Given I am on the shop page
	   When I hover my mouse on Shop 
	   And I should be able to select the disney stickers category
	   Then I should see a list of all availble disney stickers
