package TestSteps;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

//import Pages.Hooks;
import Pages.RegisterPage;
import Pages.HomePage;
import cucumber.api.java.en.Then;


public class UserRegisterTeststeps {
	//WebDriver driver; 
		 String url = "http://newtours.demoaut.com/";
		 RegisterPage rp;
		// String ActualValue;
		 HomePage hm;
		 public WebDriver driver;
		  


		    public UserRegisterTeststeps()
		    {
		      driver=Hooks.driver;
		      System.out.println("UserRegisterTeststeps construction"); 
		    }

		 
		 @Given("^Navigate to the flight application$")
		 public void navigatetotheflightapplication() throws InterruptedException, Throwable
			{
				System.out.println("navigatetoregisterpage method");
		    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 	
		    	driver.get(url);
			
			}
		 @When("^I click on register link$")
		 public void clickonregisterlink() throws InterruptedException
		 {

			 System.out.println( "clickregisterlink");
			  hm= new HomePage(driver);
			 hm.clickonregisterlink();
			Thread.sleep(2000);
		 
		 }
		 @Then("^Register page should display$")
		 public void verifyregisterpagedispay()
		 {
			 String ExpectedValue = "Register: Mercury Tours";
			String ActualValue= driver.getTitle();
			System.out.println( "expected"+ExpectedValue);
			System.out.println( "actual"+ActualValue);
			Assert.assertEquals(ExpectedValue, ActualValue);
		 }
		 
		 @And("^Close the browser$")
		 public void closethebrowser()
		 {
			 driver.close();
			 driver.quit();
		 }

		 
		 @And("^Enter \"(.*?)\" ,\"(.*?)\" and \"(.*?)\"$")
		 public void entervalues(String value1,String value2,String value3) throws InterruptedException
		 {

		 	
			  rp=new RegisterPage(driver);
			 rp.createuserregistrationwiththreefileds(value1,value2,value3);
			 
		 }
		
		 
		 @Then("^I verify the \"(.*?)\" created sucessfully$")
		 public void verifyusercreation(String value1)
		 {
			// String  sActualValue=driver.findElement(By.tagName("Body")).getText();
			 
			  rp=new RegisterPage(driver);
			 String  sActualValue=rp.capturetext();
			 	System.out.println( "check the actual value:"+sActualValue);
			 	   String expected = "Your user name is "+value1; 
			 	   Assert.assertTrue(sActualValue.contains(expected)); 
			 	
		 }
		 
	}
