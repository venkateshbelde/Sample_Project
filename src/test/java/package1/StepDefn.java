package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {


	private  static WebDriver driver=new FirefoxDriver();
	@Given("^I am able to acccess \"([^\"]*)\"$")
	public void i_am_able_to_acccess(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("field-keywords")).sendKeys(arg1);
		//driver.findElement(By.xpath("//input[@name='Go']")).click();
		
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
	}

	@Then("^I should get all my result with \"([^\"]*)\" keyword in it$")
	public void i_should_get_all_my_result_with_keyword_in_it(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
