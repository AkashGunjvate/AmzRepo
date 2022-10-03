package IRCTCPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageIRCTC {//akash
	
	private WebDriver driver;
	
	@FindBy (xpath = "//button[text()='OK']")private WebElement ok;
	
	@FindBy (xpath = "//input[@role='searchbox']")private WebElement from;
	
	@FindBy (xpath = "(//input[@role='searchbox'])[2]")private WebElement to;
	
	@FindBy (xpath = "(//input[@autocomplete='off'])[3]")private WebElement date;
	
	@FindBy (xpath = "//div[@style='width: 100%;']")private WebElement allClasses;
	
	@FindBy (xpath = "//button[text()='Search']")private WebElement search;
	
	
	public HomePageIRCTC (WebDriver driver)
	{
     PageFactory.initElements( driver,this);
	}
	
	
	public void ClickOnOk()
	{
		ok.click();
	}
	public void ClickOnFrom()
	{
		from.sendKeys("Washim");
	}
	public void ClickOnTo()
	{
		to.sendKeys("Akola");
	}
	public void ClickOnDate()
	{
		date.sendKeys("16/09/2022");
	}
	public void ClickOnOAllClasses()
	{
	   Select s = new Select (allClasses);
	   s.selectByIndex(1);
	}
	public void ClickOnSearch()
	{
		search.click();
	}
	
}
