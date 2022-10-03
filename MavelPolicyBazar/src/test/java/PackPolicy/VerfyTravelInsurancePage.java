package PackPolicy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PBPages.HomePagePB;
import PBPages.TravelInsurancePage;

public class VerfyTravelInsurancePage {
	
    private WebDriver driver;
    private HomePagePB homePage;
    private TravelInsurancePage travelInsurancePage;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.get("https://www.policybazaar.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openTravelInsurancePage() throws InterruptedException
	{
		driver.get("https://www.policybazaar.com");
		
		homePage = new HomePagePB(driver);
		homePage.openInsuranceProduct();
		Thread.sleep(3000);
		travelInsurancePage = new TravelInsurancePage(driver);
	}
	
	@Test 
	public void verifyClickOnLegalAndAdminePolicy()
	{
		travelInsurancePage.clickOnLegalAndAdminePolicy();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		  
	    if (url.equals("akash")&& title.equals("Gunjavte"))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
		
	}
	
	@Test
	public void verifyClickOnContactUs()
	{
		travelInsurancePage.clickOnContactUs();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		  
	    if (url.equals("akash")&& title.equals("Gunjavte"))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
