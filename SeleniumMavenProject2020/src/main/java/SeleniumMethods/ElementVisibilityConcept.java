package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisibilityConcept {

	public static void main(String[] args) {
		
		//System.setProperty()
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/register/");
		
		WebElement submitElement = driver.findElement(By.id("submitButton"));
		
		// isDisplayed()
		// isEnabled()
		// isSelected()
		
		System.out.println("Before submit button is enabled");
		System.out.println(submitElement.isDisplayed());
		System.out.println(submitElement.isEnabled());
		
		System.out.println("30 line is: "+ driver.findElement(By.name("agreeTerms")).isSelected());
		
		driver.findElement(By.name("agreeTerms")).click();
		
		System.out.println("34 line is: "+ driver.findElement(By.name("agreeTerms")).isSelected());
		
		System.out.println("After submit button is enabled");
		System.out.println(submitElement.isDisplayed());
		System.out.println(submitElement.isEnabled());
		
		
		
		

	}

}
