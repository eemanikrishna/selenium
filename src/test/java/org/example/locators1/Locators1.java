package org.example.locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		System.out.println(driver.getTitle());
		// 3. LinkTest
//		driver.findElement(By.linkText("Selenium Sample Script")).click();
		//4 . PartialLinkTest
		driver.findElement(By.partialLinkText("Selenium Sam")).click();
	}

}
