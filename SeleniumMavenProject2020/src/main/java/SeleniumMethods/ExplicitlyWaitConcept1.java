package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept1 {

	public static void main(String[] args) {
		
		//Explicitly Wait
		//It works with webelement and non-webelement
		//It waits available in webdriverwait class
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://app.hubspot.com/login");
		By email = By.id("username");
		//Non-WebElement
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		wait.until(ExpectedConditions.titleContains("HubSpot "));
//		System.out.println(driver.getTitle());
		
		//WebElement
		
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("ilhan@gmail.com");
		
	
		//wait.until(ExpectedConditions.presenceOfElementLocated(email));
		driver.findElement(email).sendKeys("bob@yahoo.com");
		//wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		System.out.println("Title is: "+ driver.getTitle());
		

	}

}
