package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());

		List<WebElement> list = driver.findElements(By.cssSelector("#checkbox-example label"));

		System.out.println(list.size());

	}

}