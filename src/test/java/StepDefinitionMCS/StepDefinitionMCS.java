package StepDefinitionMCS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MendeleyCreateAccountPage1.MendeleyCreateAccountPage1;
import MendeleyLandingPage.MendeleyLandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionMCS {
	
	private static WebDriver driver = null;
	
	
	
	
	
	@Given("^User is on Create New Mendeley Account$")
	public void user_is_on_create_new_mendeley_account() throws Throwable {
		
		if (driver == null){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\TP4\\.nuget\\packages\\selenium.chrome.webdriver\\2.29.0\\driver\\chromedriver.exe");
	 
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
			driver.get("https://mendeley.com/");
			driver.manage().window().maximize();
			MendeleyLandingPage landingPage  = new MendeleyLandingPage(driver);
			landingPage.createNewAccount();

	}
	@When("^User enters \"([^\"]*)\" into the email field$")
	public void user_enters_into_the_email_field(String strEmail) throws Throwable {
		MendeleyCreateAccountPage1 createAccountPage1 =  new MendeleyCreateAccountPage1(driver);
		createAccountPage1.enterEmail(strEmail);
	}

	@When("^User enters \"([^\"]*)\" into the first name field$")
	public void user_enters_into_the_first_name_field(String strFirstName) throws Throwable {
		MendeleyCreateAccountPage1 createAccountPage1 =  new MendeleyCreateAccountPage1(driver);
		createAccountPage1.enterFirstName(strFirstName);
	}

	@When("^User enters \"([^\"]*)\" into the last name field$")
	public void user_enters_into_the_last_name_field(String strLastName) throws Throwable {
		MendeleyCreateAccountPage1 createAccountPage1 =  new MendeleyCreateAccountPage1(driver);
		createAccountPage1.enterLastName(strLastName);
	}

	@When("^User enters \"([^\"]*)\" into the password field$")
	public void user_enters_into_the_password_field(String strPassword) throws Throwable {
		MendeleyCreateAccountPage1 createAccountPage1 =  new MendeleyCreateAccountPage1(driver);
		createAccountPage1.enterPassword(strPassword);
	}


	@Then("^Message displayed is \"([^\"]*)\"$")
	public void message_displayed_is(String strErrorText) throws Throwable {
		MendeleyCreateAccountPage1 createAccountPage1 =  new MendeleyCreateAccountPage1(driver);
		createAccountPage1.errorTextExists(strErrorText);
	}

}
