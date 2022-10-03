package PBPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyHeathInsurancePage {
   
	@FindBy (xpath ="(//i[@class='checkbox'])[3]")
    private WebElement spouse;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[6]")
    private WebElement mother;
	
	public FamilyHeathInsurancePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean selectSpouse()
	{
		return spouse.isSelected();
	}
	public boolean selectMother()
	{
		return mother.isSelected();
	}
	
}
