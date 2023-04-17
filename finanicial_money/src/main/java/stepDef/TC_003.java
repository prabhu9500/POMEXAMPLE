package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003 
{
	WebDriver driver;
	
	@Given("Open the browser is chrome")
	public void open_the_browser_is_chrome() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	}
	@When("Enter the url is {string}")
	public void enter_the_url_is(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}
	@Then("enter the username {string} and Password is {string}")
	public void enter_the_username_and_password_is(String user, String pass) 
	{
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("password")).sendKeys(pass);
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Then("get the title and url of the page and logout")
	public void get_the_title_and_url_of_the_page_and_logout() 
	{
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(driver.getTitle(),"OrangeHRM");
		
		soft.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		soft.assertAll();
	    
	    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    
	    driver.findElement(By.linkText("Logout")).click();
	}
	@Then("close the OrangeHRM Window")
	public void close_the_orange_hrm_window() 
	{
	    driver.close();
	}
}
