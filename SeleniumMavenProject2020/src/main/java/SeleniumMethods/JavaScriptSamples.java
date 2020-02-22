package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://darksky.net/");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle()); //webdriver
		
//		String title = JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);
		
		//WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		//JavaScriptUtil.clickElementByJS(signupLink, driver);
		//JavaScriptUtil.refreshBrowserByJS(driver);
		//JavaScriptUtil.generateAlert(driver, "This is sign up page");
		//JavaScriptUtil.drawBorder(signupLink, driver);
		
		
		//JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "boby@gmail.com");
		
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(email, driver);
//		email.sendKeys("boby@gmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("123@test");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
//		String browserValue = JavaScriptUtil.getBrowserInfo(driver);
//		System.out.println(browserValue);
		
		//JavaScriptUtil.scrollPageDown(driver);
		JavaScriptUtil.specificScrollPageDown(driver);
		
		
		

	}

}
