package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		//https://mail.rediff.com/cgi-bin/login.cgi
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Locator concept
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		//Handle alert
		Alert alert = driver.switchTo().alert(); // calling alert interface
		
		/*
		 * void dismiss(); //cancel

           void accept(); //OK 

           String getText(); //String

           void sendKeys(String keysToSend); // Send any value 
		 */
		
		String text = alert.getText();
		System.out.println(text);
		
		//verify
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct text: "+ text);
		}else{
			System.out.println("incorrect text"+ text);
		}
		
		//alert.accept(); //ok
		alert.dismiss(); //cancel
		
		driver.quit();
		
	}

}
