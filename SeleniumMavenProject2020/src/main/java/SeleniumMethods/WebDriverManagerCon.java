package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerCon {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.iedriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://siliconelabs.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
