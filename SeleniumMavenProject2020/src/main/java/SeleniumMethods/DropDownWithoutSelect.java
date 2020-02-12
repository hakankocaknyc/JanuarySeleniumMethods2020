package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDownWithoutSelect {

	public static void main(String[] args) {
		
	// How to handle drop down menu without select class	
		
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());
		
		//For loop to print out
		for(int i=0; i<dayList.size(); i++){
			//System.out.println(dayList.get(i).getText());
			String text = dayList.get(i).getText();
			System.out.println(text);
			if(text.equals("9")){
				dayList.get(i).click();
				break;
			}
			
		}
		
		
	}

}
