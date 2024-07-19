package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Narender mekala");
		driver.findElement(By.name("email")).sendKeys("dummy@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("naren");
		driver.findElement(By.xpath("//label[@for='exampleCheck1']")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select option = new Select(dropdown);
		option.selectByIndex(0);
		
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("16-05-1997");
		driver.findElement(By.className("btn-success")).click();
		
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		
		System.out.println("this is second change");
		System.out.println("this is another in second change");
		
	}

}
