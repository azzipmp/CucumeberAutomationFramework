package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FlightPage {
	
WebDriver driver;
//webelements


public FlightPage(WebDriver driver){
	this.driver = driver;
	//This initElements method will create  all WebElements
	PageFactory.initElements(driver, this);
}

//methods

}
