package SelIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		System.out.println(driver.getTitle() + driver.getCurrentUrl());
		driver.close();

		System.out.println("this is the third change");
		System.out.println("this is the third change");
		System.out.println("this is the third change");
		System.out.println("this is the third change");
		System.out.println("this is the third change");
		System.out.println("this is the third change");
		System.out.println("this is the third change");
		
		System.out.println("this is the fourth change");
		System.out.println("this is the fourth change");
		System.out.println("this is the fourth change");
		


	}
}
