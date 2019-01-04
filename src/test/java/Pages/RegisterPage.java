package Pages;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class RegisterPage {
WebDriver driver;

	@FindBy(name="firstName")
	WebElement fistnametext;
	
	@FindBy(name="lastName")
	WebElement lastNametxt;
	@FindBy(name="phone")
	WebElement phonetxt;
	@FindBy(name="userName")
	WebElement userNametxt;
	@FindBy(name="address1")
	WebElement address1txt;
	@FindBy(name="address2")
	WebElement address2txt;
	@FindBy(name="city")
	WebElement citytxt;
	@FindBy(name="state")
	WebElement statetxt;
	@FindBy(name="postalCode")
	WebElement postalCodetxt;
	@FindBy(name="country")
	WebElement countrydrp;
	@FindBy(name="email")
	WebElement emailtxt;
	@FindBy(name="password")
	WebElement passwordtxt;
	@FindBy(name="confirmPassword")
	WebElement confirmPasswordtxt;
	@FindBy(name="register")
	WebElement registerbtn;
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	
	@FindBy(tagName="body")
	WebElement bodytag;
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
	public void createuserregistration() throws InterruptedException
	{
	
				fistnametext.sendKeys("john");	
				lastNametxt.sendKeys("Testlastname");
				phonetxt.sendKeys("8888888889");
				userNametxt.sendKeys("testusername");
				address1txt.sendKeys("testaddress");
				address2txt.sendKeys("testaddress2");
				citytxt.sendKeys("Herndon");
				statetxt.sendKeys("Va");
				postalCodetxt.sendKeys("23456");
		 	  	Select drpcountry = new Select(countrydrp);
		 	    drpcountry.selectByVisibleText("UNITED STATES");
		 	    emailtxt.sendKeys("Test@test.com");
		 	    passwordtxt.sendKeys("Test1234$");
		 	    confirmPasswordtxt.sendKeys("Test1234$");
		 	    registerbtn.click();
		 	   Thread.sleep(2000);		
	}
	
	public void createuserregistrationwiththreefileds(String val1,String val2,String val3) throws InterruptedException
	{
	
				 emailtxt.sendKeys(val1);
		 	    passwordtxt.sendKeys(val2);
		 	    confirmPasswordtxt.sendKeys(val3);
		 	    registerbtn.click();
		 	   Thread.sleep(2000);		
	}
	
	
	public String capturetext()
	{
		return bodytag.getText();
	}
}
