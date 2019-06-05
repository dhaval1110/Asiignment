package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {

	WebDriver driver;
	@Given("^I want food in \"([^\"]*)\"$")
	public void I_want_food_in(String postalcode) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Class\\SeleniumJars\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   driver.get("http://www.just-eat.co.uk/");
	   driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(postalcode);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("^I search for restaurants$")
	public void I_search_for_restaurants() throws Throwable {
	  driver.findElement(By.id("serp-search")).sendKeys("top");
	  
	  Thread.sleep(2000);
	  
	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void I_should_see_some_restaurants_in(String arg1) throws Throwable {
		List<WebElement> Links = driver.findElements(By.xpath("//div[@data-test-id='openrestaurants']/section/a/div[3]/h3"));
		System.out.println("Total resutarant in " + arg1 + " is: ");
		
		for (WebElement a : Links) {
			System.out.println(a.getText());
		}
	
	
	
		driver.close();
	}

	@When("^I search for specific cuisine as \"([^\"]*)\"$")
	public void I_search_for_specific_cuisine_as(String arg1) throws Throwable {
	
		driver.findElement(By.id("serp-search")).sendKeys(arg1);
		  
		  Thread.sleep(2000);
	}

}
