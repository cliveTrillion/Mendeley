package MendeleyLandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MendeleyLandingPage {
	WebDriver driver;
	By signInLink = By.linkText("Sign In");
	By createNewUserLink = By.linkText("Create account");
	
	public MendeleyLandingPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void signIn(){
		driver.findElement(signInLink).click();
	}
	
	public void createNewAccount(){
		driver.findElement(createNewUserLink).click();
	}
	
}
