Feature: validate login page with parameter

 Scenario: Validate Login Page
   
   Given Open the chrome browser
   
   When  Navigate the url is "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   
   Then  enter the username is "Admin" and Password is "admin123"
   
   Then  get the title of the page and logout
   
   Then  close the chrome browser