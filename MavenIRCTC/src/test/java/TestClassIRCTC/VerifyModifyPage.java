package TestClassIRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IRCTCPages.HomePageIRCTC;
import IRCTCPages.ModifyPage;

public class VerifyModifyPage {
	
	private WebDriver driver;
	private HomePageIRCTC homePageIRCTC;
	private ModifyPage modifyPage;
	
	@BeforeClass
	public void Openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{              
		  System.out.println("Before Method");
		  
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  
		  homePageIRCTC = new  HomePageIRCTC(driver);
		  
		 
		  
		  homePageIRCTC.ClickOnOk();
		  homePageIRCTC.ClickOnFrom();
		  homePageIRCTC.ClickOnTo();
		  homePageIRCTC.ClickOnDate();
		  homePageIRCTC.ClickOnOAllClasses();
		  
		  Thread.sleep(3000);
		  homePageIRCTC.ClickOnSearch();
		  
		  modifyPage = new ModifyPage(driver);
	}            

	@Test
	public void VerifyDateCheckBox()
	{
		System.out.println("A");
	modifyPage.ClickOnCheckBoxDate();
	}
	
	@Test
	public void VerifyBerthCheckBox()
	{
		System.out.println("B");
		modifyPage.ClickOncheckBoxBerth();
	}
	
//	@AfterClass
//	public void CloseBrowser()
//	{
//		System.out.println("Out");
//		driver.close();
//	}
}
