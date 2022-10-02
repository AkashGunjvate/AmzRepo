package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Declaration
	
	
	//akash
	
	@FindBy (xpath = "//input[@id='email']") private WebElement userName;
	
	@FindBy (xpath = "//input[@id='pass']") private WebElement password;
	
    //@FindBy (xpath = "//button[@id='loginbutton']") private WebElement loginButton;
	
	//@FindBy (xpath = "//a[text()='Create New Account']") private WebElement createNewAcc;
	
	@FindBy (xpath = "//a[text()='Messenger']") private WebElement massengerLink;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]") private WebElement mele;
	
	
	// Initialization
	
	public LoginPage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	// Use 
	
	public void sendUserName()
	{
		userName.sendKeys("Virat Kohli");
		password.sendKeys("KlRahul123");
	//	loginButton.click();
	//	createNewAcc.click();
		massengerLink.click();
	}
	
	public void openMasenger()
	{
		massengerLink.click();
	}
	public boolean clickOnMele()
	{
		return mele.isSelected();
	}
	
	

}
