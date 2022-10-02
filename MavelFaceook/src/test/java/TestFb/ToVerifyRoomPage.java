package TestFb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.MassengerPage;
import Pages.RoomsPage;

public class ToVerifyRoomPage {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private RoomsPage roomsPage;
	private MassengerPage  massengerPage;
	
	@BeforeClass
   public void openBrowser()
   {
		System.out.println("BeforeClass");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
	@BeforeMethod
	public void openRoomPage()
	{
		
		driver.get("https://www.facebook.com/"); 
		
		loginPage = new LoginPage(driver);
		loginPage.openMasenger();
		
		massengerPage = new MassengerPage(driver);
		massengerPage.openRooms();
	    roomsPage = new RoomsPage(driver);
	}
	@Test
	public void verifyConatctToHelp()
	{
		roomsPage.openFeatures();
	    
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
	public void verifyReturnToMassengerPage()
	{
		roomsPage.backToMassege();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("Anil")&& title.equals("Ghole"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
//	@AfterMethod
//	public void logoutFromApp()
//	{
//		System.out.println("LogOut");
//	}
	
	@AfterClass
	public void closeBrowser()
	{
		
		driver.close();
	}
}























