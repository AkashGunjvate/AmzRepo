package TestFb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.MassengerPage;
import Pages.RoomsPage;

public class Fbclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openMasenger();
		
		MassengerPage massengerPage = new MassengerPage(driver);
		massengerPage.openRooms();
		
		RoomsPage roomsPage = new RoomsPage(driver);
		roomsPage.openFeatures();
		
		System.out.println(driver.getCurrentUrl());
	}

}
