package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println(rows.size());
		List<WebElement>  cols = rows.get(2).findElements(By.tagName("td"));
		
		for( int i=0 ; i< cols.size() ; i++ ) {
			
			System.out.println(cols.get(i).getText());
		}
		
	}

}
