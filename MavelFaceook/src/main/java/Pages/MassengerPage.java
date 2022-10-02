package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassengerPage {
	
    @FindBy (xpath = "//a[text()='Rooms']") private WebElement room;
	
	@FindBy (xpath = "//a[text()='Features']") private WebElement features;
	
	//djjcj
	// Initialization
	
	
	//kahdjgjdghsdvshdv
	
	public MassengerPage (WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
	}
	
	// Use 
	
	    public void openRooms() {
			room.click();
			
		}
		public void openFeatures() {
			features.click();
		}
	}

