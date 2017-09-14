package MendeleyCreateAccountPage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class MendeleyCreateAccountPage1 {
	WebDriver driver;
	By enterEmail = By.id("email");
	By enterFirstName = By.id("first_name");
	By enterLastName = By.id("last_name");
	By enterPassword = By.id("password");
	By continueButton = By.xpath("//Button[@class='button-primary with-spinner with-icon-after icon-navigateright float-right go-next']");
	By browserBody = By.tagName("body");
	
	public MendeleyCreateAccountPage1(WebDriver driver){
		this.driver = driver;
		
	}
	public void enterEmail(String strEmail){
		driver.findElement(enterEmail).clear();
		driver.findElement(enterEmail).sendKeys(strEmail);
		driver.findElement(enterEmail).sendKeys(Keys.RETURN);
		
	}
	
	public void enterFirstName(String strFirstName){
		driver.findElement(enterFirstName).clear();
		driver.findElement(enterFirstName).sendKeys(strFirstName);
		driver.findElement(enterFirstName).sendKeys(Keys.RETURN);
	}
	
	public void enterLastName(String strLastName){
		driver.findElement(enterLastName).clear();
		driver.findElement(enterLastName).sendKeys(strLastName);
		driver.findElement(enterLastName).sendKeys(Keys.RETURN);
	}
	
	public void enterPassword(String strPassword){
		driver.findElement(enterPassword).clear();
		driver.findElement(enterPassword).sendKeys(strPassword);
		driver.findElement(enterPassword).sendKeys(Keys.RETURN);
	}
	
	public void typeEnter(){
		driver.findElement(browserBody).sendKeys(Keys.RETURN);
	}

	public void clickContinue(){
		driver.findElement(continueButton).click();
	}
	
	public void errorTextExists(String strErrorText){
		String bodyText = driver.findElement(browserBody).getText();
		Assert.assertTrue("Text not found!", bodyText.contains(strErrorText));
	}
}
