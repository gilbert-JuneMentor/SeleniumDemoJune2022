package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumWebDriver {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Volumes/Giana/Eclipse-Project_June2022/SeleniumDemoune2022/driver/chromedriver 4");
		
		//Launching Chrome
		WebDriver driver = new ChromeDriver(); // instantiating driver 
		
		
		// Entering URL
		driver.get("https://www.google.com/");
		
		
		
		
	}

}
