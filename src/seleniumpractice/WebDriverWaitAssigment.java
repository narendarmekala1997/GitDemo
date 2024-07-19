package seleniumpractice;

import java.time.Duration;
import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitAssigment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.cssSelector("input[value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement drop = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		
		Select down = new Select(drop);
		down.selectByIndex(0);
		
		driver.findElement(By.className("termsText")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("btn-primary")));
		
		List<WebElement> products = driver.findElements(By.className("card"));
		
		for( int i=0 ; i<products.size() ; i++ ) {
			products.get(i).findElement(By.className("btn-info")).click();
		}
		driver.findElement(By.className("btn-primary")).click();
	}

}
