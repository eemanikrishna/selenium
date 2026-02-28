package org.example.locators2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// 5. class name
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		List<WebElement> hElements = driver.findElements(By.className("control-group"));
		System.out.println(hElements.size());
		// 6. tag name
		List<WebElement> yElements = driver.findElements(By.tagName("input"));
		System.out.println(yElements.size());

	}

}
