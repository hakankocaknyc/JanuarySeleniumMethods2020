package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Implicitly Wait
		
		//This wait tells webdriver to wait if the element is not available immediately and 
		//webdriver waits till the element is visible in specific time
		//NoSuchElementException
		//Title is not webelement
		//imp wait can be used only webelement
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("Title is: "+driver.getTitle());

	}

}
