package seleniumpractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println( footerDriver.findElements(By.tagName("a")).size() );
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
	   System.out.println( columnDriver.findElements(By.tagName("a")).size());
	   
	   for( int i=1 ; i<columnDriver.findElements(By.tagName("a")).size() ; i++ )
	   {
		   String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		   columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		   Thread.sleep(5000);
	   }
	   Set<String> childs = driver.getWindowHandles();
	   System.out.println(childs.size());
	   Iterator<String> it = childs.iterator();
	  
	   while(it.hasNext()) {
		   
		   System.out.println(driver.switchTo().window(it.next()).getTitle());
		   

	   }
	}

}
