package PackPolicy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPolicy {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.policybazaar.com/");
		
	}

}
