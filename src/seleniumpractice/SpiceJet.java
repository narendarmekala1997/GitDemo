package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Family & Friends']")).isSelected());
		
		//round trip
		
		List<WebElement> checkboxes = driver.findElements(By.className("r-1w6e6rj"));
		System.out.println(checkboxes.size());
		//driver.findElement(By.("div[css='66']")).click();
		
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
	}

}
