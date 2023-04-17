package stepDef;

import static org.junit.Assert.assertEquals;


import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testfb {
	
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
	 
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
	}

	@When("navigate to fb")
	public void navigate_to_fb()  {
	 
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

	@When("get the current url of page")
	public void get_the_current_url_of_page()   { 
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		
	}

	@Then("close the browser")
	public void close_the_browser() {
	  
		driver.close();
	}


}
