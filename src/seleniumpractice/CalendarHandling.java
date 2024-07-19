package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
		
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String expectedList[] = {monthNumber,date,year};

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Thread.sleep(2000);
		
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		driver.findElements(By.className("react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		//System.out.println(driver.findElement(By.className("react-date-picker__inputGroup")).getText());
		
		List<WebElement> list = driver.findElements(By.className("react-date-picker__inputGroup__input"));
		
		for( int i=0; i<list.size();i++) {
			
			Assert.assertEquals(list.get(i).getAttribute("value"), expectedList[i]);
		}
		

		
		//driver.close();
	}

}
