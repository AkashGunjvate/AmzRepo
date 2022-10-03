package PBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePB {
	
	//Akash
	
	//Declaration
	
	//private WebDriver driver;
	                 
	@FindBy (xpath = "//a[@href='javascript:void(0)']")
	private WebElement insuranceProduct;

	@FindBy (xpath = "//a[text()='Claim ']")
	private WebElement claim;

	@FindBy (xpath = "//i[@class='icon-bg homeIconsBg icon-bg-new ti']")
	private WebElement travelInsurance ;

	@FindBy (xpath = "(//div[@class='shadowHandlerBox'])[4])")
	private WebElement carInsurance;
	
	@FindBy (xpath = "(//div[@class='shadowHandlerBox'])[6]")
	private WebElement familyHealthInsurance;

	//
	
	public HomePagePB (WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//use
	
	public void openInsuranceProduct()
	{
		insuranceProduct.click();
	}
	public void openClaim()
	{
		claim.click();
	}
	public void openTravelInsurance()
	{
		 travelInsurance.click();
	}
	public void openCarInsurance()
	{
		carInsurance.click();
	}
	public void openFamilyHealthInsurance()
	{
		familyHealthInsurance.click();
	}
}
