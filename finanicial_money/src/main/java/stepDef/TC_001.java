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


public class TC_001 
{
	WebDriver driver;
	
	@Given("Open the browser")
	public void open_the_browser() 
	{
	    WebDriverManager.chromedriver().setup();
	    
	    driver=new ChromeDriver();
	}

	@When("Navigate the orangeHRM url")
	public void navigate_the_orange_hrm_url() 
	{
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("Maximize the window")
	public void maximize_the_window() 
	{
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Then("Get the title of the page")
	public void get_the_title_of_the_page() 
	{
	    String actual_title=driver.getTitle();
	    
	    Assert.assertEquals(actual_title, "OrangeHRM");
	}

	@Then("Close the OrangeHRM page")
	public void close_the_orange_hrm_page()
	{
	    driver.close();
	}
	
	@Then("Get the url of the page")
	public void get_the_url_of_the_page() {
	   Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Then("Enter the username and password")
	public void enter_the_username_and_password() 
	{
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("Click on login button")
	public void click_on_login_button() 
	{
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("Veirfy title of the of page and click on logout")
	public void veirfy_title_of_the_of_page_and_click_on_logout() 
	{
	    Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	    
	    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    
	    driver.findElement(By.linkText("Logout")).click();
	}



}
