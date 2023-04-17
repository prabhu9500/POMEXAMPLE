@F001
Feature: Validate OrangeHRM Page

	Background:
		
		Given Open the browser
    When Navigate the orangeHRM url
    Then Maximize the window


  @SC001
  Scenario: Validate Title of the Page
    
    And Get the title of the page
    Then Close the OrangeHRM page

	@SC002
  Scenario: Validate URL of the Page
    
    And Get the url of the page
    Then Close the OrangeHRM page

  @SC003
  Scenario: Validate Login Page
   
    Then Enter the username and password
    Then Click on login button
    And Veirfy title of the of page and click on logout
    Then Close the OrangeHRM page
