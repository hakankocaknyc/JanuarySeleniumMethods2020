package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		System.out.println(driver.getTitle());
		
	    //WebElement header = driver.findElement(By.cssSelector("body > h2"));
	    WebElement header = driver.findElement(By.xpath("//h2[contains(text(), 'Title bar')]"));
	    System.out.println(header.getText());
	    System.out.println(driver.getTitle());
	    driver.switchTo().defaultContent();
	    System.out.println(driver.getTitle());
		
		

	}

}
