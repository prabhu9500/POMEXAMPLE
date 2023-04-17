Feature: validate OrangeHRM login page with DDF

  Scenario Outline: Validate OrangeHRM Login Page with DDF
    Given Open the browser is chrome
    When Enter the url is "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then enter the username "<username>" and Password is "<password>"
    Then get the title and url of the page and logout
    Then close the OrangeHRM Window

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |
