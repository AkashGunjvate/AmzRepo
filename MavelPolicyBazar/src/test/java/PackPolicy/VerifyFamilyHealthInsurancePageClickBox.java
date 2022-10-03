package PackPolicy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBPages.FamilyHeathInsurancePage;
import PBPages.HomePagePB;

public class VerifyFamilyHealthInsurancePageClickBox {

	private WebDriver driver;
	private HomePagePB homepage;
	private FamilyHeathInsurancePage familyHeathInsurancePage;
	
	@BeforeClass
	public void openBrowser()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@BeforeMethod 
	public void openVerifyFamilyHealthInsurancePage() 
	{
		driver.get("https://www.policybazaar.com/");
		
		homepage = new HomePagePB(driver);
		homepage.openFamilyHealthInsurance();
		
		familyHeathInsurancePage =new FamilyHeathInsurancePage(driver);
	}
	@Test
	public void verifyEUCanSelectSpouse()
	{
		if(familyHeathInsurancePage.selectSpouse()==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
		
	

}
