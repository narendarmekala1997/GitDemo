package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "narender";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("narender");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("narendarmekala@gmail.com");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("dummy@gmail.com");
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("798456120");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] arr = passwordText.split("'");
		
		return arr[1];
	}

}
