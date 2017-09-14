package MendeleyLandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;

public class MendeleyLandingPage {
	WebDriver driver;
	By signInLink = By.linkText("Sign In");
	By createNewUserLink = By.linkText("Create account");
	
	public MendeleyLandingPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void signIn(){
		driver.findElement(LandingPage.signInLink).click();
	}
	
	public void createNewAccount(){
		driver.findElement(LandingPage.createNewUserLink).click();
	}
	
}
