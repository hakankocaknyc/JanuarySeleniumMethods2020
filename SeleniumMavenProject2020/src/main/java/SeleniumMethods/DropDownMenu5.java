package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu5 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		selectDropDownByIndex(driver, day, 9);
		selectDropDownByIndex(driver, month, 9);
		selectDropDownByIndex(driver, year, 9);

	}
	
    public static void selectDropDownByIndex(WebDriver driver, By locator, int value){
		
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}

}
