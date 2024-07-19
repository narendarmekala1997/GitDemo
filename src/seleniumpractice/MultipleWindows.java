package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> wins =  driver.getWindowHandles();
		
		Iterator<String> it = wins.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course);
		
	}

}
