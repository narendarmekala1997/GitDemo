package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.className("ui-menu-item-wrapper"));
		
		for( int i=0 ; i<options.size() ; i++ ) {
			if(options.get(i).getText().equalsIgnoreCase("India")) {
				options.get(i).click();
				Thread.sleep(1000);
				break;
			}
		}
	
		
		
	}

}
