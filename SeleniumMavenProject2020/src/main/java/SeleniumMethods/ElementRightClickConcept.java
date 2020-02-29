package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementRightClickConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Actions
		
		Actions actions = new Actions(driver);
		WebElement rightClicikElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rightClicikElement).build().perform();
		
		// context-menu-item context-menu-icon context-menu-icon-copy
		
		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		
		String text = copyElement.getText();
		System.out.println(text);
		if(text.equals("Copy")){
			System.out.println("Correct copy");
		}else{
			System.out.println("incorrect copy");
		}
		
		copyElement.click();
		

	}

}
