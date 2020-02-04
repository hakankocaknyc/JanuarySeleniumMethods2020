package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Set property
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); //key: driver == value: driver's path
		
		//Chromedriver: to connect with chrome browser
		
		//set up browser
		
		WebDriver driver = new ChromeDriver();
		
		//launch browser
		driver.get("https://www.google.com/"); //org.openqa.selenium.InvalidArgumentException
		
		//get title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation --- verify
		if(title.equals("Google")){  //Assert.equ
			System.out.println("correct title");
		}else{
			System.out.println("incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.google.com/")){
			System.out.println("correct url");
		}else{
			System.out.println("incorrect url");
		}
		
		//System.out.println(driver.getPageSource());
		
		//driver.close(); //close current browser
		//driver.quit(); // close all browser instance
		
		//
		

	}

}
