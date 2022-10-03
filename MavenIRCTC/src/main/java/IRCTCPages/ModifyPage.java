package IRCTCPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ModifyPage {
	
	private WebDriver driver;
	
    @FindBy (xpath = "//label[text()='Flexible With Date']")private WebElement checkBoxDate;
	
	@FindBy (xpath = "//input[@role='searchbox']")private WebElement checkBoxBerth;
//	
//	@FindBy (xpath = "//label[text()='Train with Available Berth ']")private WebElement to;
//	
//	@FindBy (xpath = "(//input[@autocomplete='off'])[3]")private WebElement date;

	public  ModifyPage (WebDriver driver)
	{
     PageFactory.initElements( driver,this);
	}
	//use
	
	
	public boolean ClickOnCheckBoxDate()
	{
		 boolean a = checkBoxDate.isSelected();
	     return a;
	}
	public boolean ClickOncheckBoxBerth()
	{
		 boolean b = checkBoxBerth.isSelected() ;
		 return b;
	}
//	public void ClickOnTo()
//	{
//		to.sendKeys("Akola");
//	}
//	public void ClickOnDate()
//	{
//		date.sendKeys("20/09/2122");
//	}
	
}
