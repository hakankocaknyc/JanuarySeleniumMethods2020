package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Verizon {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizonwireless.com/");
		By phone = By.xpath("//button[contains(text(),'Phones list')]");
		
		ElementUtil.mouseOver(driver, phone);
		
		driver.findElement(By.id("thirdLevel00")).click();

	}
	
	

}
