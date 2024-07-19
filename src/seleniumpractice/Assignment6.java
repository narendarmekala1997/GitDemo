package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//label[@for='honda']/input")).click();
		String impText = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		
		WebElement staticDrop = driver.findElement(By.id("dropdown-class-example"));
		
		Select options = new Select(staticDrop);
		List<WebElement> optionsList =  options.getOptions();
		
		for(int i=0; i<optionsList.size() ; i++) {
			
			if(optionsList.get(i).getText().equalsIgnoreCase(impText)) {
				optionsList.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("name")).sendKeys(impText);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		alertText = alertText.split(",")[0].split(" ")[1];
		//System.out.println(alertText);
		Assert.assertEquals(impText, alertText);
		driver.switchTo().alert().accept();
		
		
	}

}
