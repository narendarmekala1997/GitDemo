package seleniumpractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemsToCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());

	}

	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List itemsNeededList = Arrays.asList(itemsNeeded);

		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText().split("-")[0].trim();

			if (itemsNeededList.contains(name)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == itemsNeededList.size())
					break;
			}
		}

	}

}
