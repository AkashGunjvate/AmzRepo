package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	@FindBy (xpath = "") private WebElement createNewAccount; 
    
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void clickOnCreateNewAccountPage()
	{
		createNewAccount.click();
	}
	
	
	
}
