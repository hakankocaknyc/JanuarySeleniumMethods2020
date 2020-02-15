package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept2 {

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
		
		
		getElement(driver, email).sendKeys("newjersey@gmail.com");
		getElement(driver, password).sendKeys("test.1123");
		getElement(driver, loginBtn).click();
	

	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
		
	}

}
