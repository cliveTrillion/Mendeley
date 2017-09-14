package mendeleyCreateAccountPersonalDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjects.AccountDetails;

import junit.framework.Assert;

public class mendeleyCreateAccountPersonalDetails {
	WebDriver driver;
	
	public mendeleyCreateAccountPersonalDetails(WebDriver driver){
		this.driver = driver;
		
	}
	public void enterEmail(String strEmail){
		
		driver.findElement(AccountDetails.enterEmail).clear();
		driver.findElement(AccountDetails.enterEmail).sendKeys(strEmail);
		driver.findElement(AccountDetails.enterEmail).sendKeys(Keys.RETURN);
		
	}
	
	public void enterFirstName(String strFirstName){
		driver.findElement(AccountDetails.enterFirstName).clear();
		driver.findElement(AccountDetails.enterFirstName).sendKeys(strFirstName);
		driver.findElement(AccountDetails.enterFirstName).sendKeys(Keys.RETURN);
	}
	
	public void enterLastName(String strLastName){
		driver.findElement(AccountDetails.enterLastName).clear();
		driver.findElement(AccountDetails.enterLastName).sendKeys(strLastName);
		driver.findElement(AccountDetails.enterLastName).sendKeys(Keys.RETURN);
	}
	
	public void enterPassword(String strPassword){
		driver.findElement(AccountDetails.enterPassword).clear();
		driver.findElement(AccountDetails.enterPassword).sendKeys(strPassword);
		driver.findElement(AccountDetails.enterPassword).sendKeys(Keys.RETURN);
	}
	
	public void typeEnter(){
		driver.findElement(AccountDetails.browserBody).sendKeys(Keys.RETURN);
	}

	public void clickContinue(){
		driver.findElement(AccountDetails.continueButton).click();
	}
	
	public void errorTextExists(String strErrorText){
		String bodyText = driver.findElement(AccountDetails.browserBody).getText();
		Assert.assertTrue("Text not found!", bodyText.contains(strErrorText));
	}
}
