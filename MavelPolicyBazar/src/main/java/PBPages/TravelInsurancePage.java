package PBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelInsurancePage {
	
	//private WebDriver driver;
	
	@FindBy (xpath = "//p[text()='Germany']") private WebElement destination;
	
	@FindBy (xpath = "//button[text()='Proceed to trip dates']") private WebElement proceedButton;
	
	@FindBy (xpath = "//a[text()='Contact Us']") private WebElement contactUs;
	
	@FindBy (xpath = "//a[text()='Legal and Admin Policies']") private WebElement legalAndAdminePolicy;
	

public TravelInsurancePage(WebDriver driver)
{
	//this .driver= driver;
	PageFactory.initElements( driver, this );
}

public void enterDestination()
{
	destination.click();
}
public void enterProceedButton()
{
	proceedButton.click();
}
public void clickOnContactUs()
{
	contactUs.click();
}
public void clickOnLegalAndAdminePolicy()
{
	legalAndAdminePolicy.click();
}

}//(//i[@class='checkbox'])[2]
