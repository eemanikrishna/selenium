package org.example.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		// Locators
		// 1. name
		driver.findElement(By.name("q")).sendKeys("laptops");
		// 2. id
		boolean footerStatus=driver.findElement(By.id("container")).isDisplayed();
		System.out.println(footerStatus);
		
		
	}
}
//https://www.techlistic.com/p/selenium-practice-form.html