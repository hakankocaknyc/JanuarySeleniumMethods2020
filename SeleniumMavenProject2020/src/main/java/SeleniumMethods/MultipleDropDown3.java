package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class MultipleDropDown3 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectMultipleDropDown(driver, "choice 2", "choice 4", "choice 6");

	}
	
	public static void selectMultipleDropDown(WebDriver driver, String... value){ //Array
		
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		
		for(int i= 0; i<dropList.size(); i++){
			String text = dropList.get(i).getText();
			System.out.println(text);
			
			//Array
			for(int j=0; j< value.length; j++){
				
				try {
					if(!text.isEmpty()){
						if(text.equals(value[j])){
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
	}

}
