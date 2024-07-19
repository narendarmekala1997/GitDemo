package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgignment5Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		WebElement top = driver.findElement(By.name("frame-top"));
		
		driver.switchTo().frame(top);
		
		WebElement middle = driver.findElement(By.name("frame-middle"));
		
		driver.switchTo().frame(middle);
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
