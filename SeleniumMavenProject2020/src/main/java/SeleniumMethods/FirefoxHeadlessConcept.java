package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadlessConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(ff);
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());

	}

}
