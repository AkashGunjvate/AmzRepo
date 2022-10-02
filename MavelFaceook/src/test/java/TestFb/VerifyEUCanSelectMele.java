package TestFb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SignInPage;

public class VerifyEUCanSelectMele {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private SignInPage signInPage;
	
@BeforeClass
public void OpenBrowser()
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeMethod
public void openLoginPage() throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	
Thread.sleep(2000);
	
 	signInPage = new SignInPage(driver);
	signInPage.clickOnCreateNewAccountPage();		

    loginPage = new LoginPage(driver);
 }

@Test
public void meleFeild()
{
	if(loginPage.clickOnMele()==true)
	{
	   System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
	
@AfterClass	
public void closeBrowser()
{
	driver.close();
}

	
	
	
	
}
