package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
		
	    @FindBy (xpath = " //a[text()=' Return to messenger.com ']") private WebElement rerutnToMassage;
		
		@FindBy (xpath = " //a[text()=' Visit our help center ']") private WebElement helpCenter;
		
		
		// Initialization
		
		public RoomsPage (WebDriver driver123)
		{
			PageFactory.initElements(driver123, this);
		}
		
		// Use 
		
		    public void backToMassege() {
		    	rerutnToMassage.click();
				
			}
			public void openFeatures() {
				helpCenter.click();
			}
		

}
