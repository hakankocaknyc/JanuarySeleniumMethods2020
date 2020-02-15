package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println("Title is :"+ driver.getTitle());
		
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		getElement(driver, email, 3).sendKeys("Newyork@gmail.com");
		getElement(driver, password, 1).sendKeys("test.123");
		getElement(driver, loginBtn, 2).click();
		
		
	}
	
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		waitForPresenceOfElement(driver, locator, timeout);
		WebElement element = driver.findElement(locator);
		return element;
	
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
