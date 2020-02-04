package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasicWithGecko {

	public static void main(String[] args) {
		
		///Users/bobit/Documents/Drivers/geckodriver
		
		//Set property
		
		System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
		
		//Webdriver define --- Launch browser
		
		WebDriver driver = new FirefoxDriver();
		
		//URL
		driver.get("https://www.google.com/");
		
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//close browser
		//driver.quit();
		
		//NoSuchElementException --- locator- wait
		//TimeOutwaitException --- 15 seconds 
		

	}

}
