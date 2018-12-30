package Pages;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	
	@FindBy(linkText="SIGN-ON")
	WebElement signonlink;
	
	@FindBy(name="userName")
	WebElement usernametextfield;
	
	@FindBy(name="password")
	WebElement passwordtextfield;
	
	@FindBy(name="login")
	WebElement signonbtn;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonregisterlink()
	{
		//driver.fineElement(By.linkText("Register")).click;
		registerlink.click();
	}
}
