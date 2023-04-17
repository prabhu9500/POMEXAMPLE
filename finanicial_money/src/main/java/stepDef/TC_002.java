package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002 
{
	WebDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() 
	{
	   WebDriverManager.chromedriver().setup();
	   
	   driver=new ChromeDriver();
	}
	@When("Navigate the url is {string}")
	public void navigate_the_url_is(String url) 
	{
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Then("enter the username is {string} and Password is {string}")
	public void enter_the_username_is_and_password_is(String user, String pass) 
	{
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("password")).sendKeys(pass);
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@Then("get the title of the page and logout")
	public void get_the_title_of_the_page_and_logout() 
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	    
	    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    
	    driver.findElement(By.linkText("Logout")).click();
	    
	}
	@Then("close the chrome browser")
	public void close_the_chrome_browser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
	   
	}
	
}
