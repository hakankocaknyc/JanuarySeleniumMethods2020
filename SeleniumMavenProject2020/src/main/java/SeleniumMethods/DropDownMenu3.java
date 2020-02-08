package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu3 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
	    selectDropDownValueBytext(driver, day, "15");
		selectDropDownValueBytext(driver, month, "Apr");
		selectDropDownValueBytext(driver, year, "2017");
		
	
	}
	
	public static void selectDropDownValueBytext(WebDriver driver, By locator, String value){
		
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}

}
