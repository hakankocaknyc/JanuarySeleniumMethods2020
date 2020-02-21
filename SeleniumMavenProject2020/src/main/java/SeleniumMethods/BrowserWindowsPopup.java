package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.className("black")).click();
		
		//getWindowHandle() == get the current window handle
		//getWindowHandles() == get the window handles that opened
		//switchTo().window() == swtich to between windows
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window is: "+ parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window is: "+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is: "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is :"+ driver.getTitle());
		
		//driver.close();
		
		

	}

}
