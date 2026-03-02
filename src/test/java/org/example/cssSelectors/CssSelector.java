package org.example.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// 1. tag id id="small-searchterms"
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles");
		
		//2 . tag classname class="search-box-text"
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobiles");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("mobiles");
		
		// 3. tag attribute value placeholder="Search store"
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("mobiles");

		// 4. tag classname attribute
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("mobile");
		
		
	}

}
