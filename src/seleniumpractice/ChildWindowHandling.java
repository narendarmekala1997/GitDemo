package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.className("red")).getText());
		driver.findElement(By.className("red")).getText();
		String emailId = driver.findElement(By.className("red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
