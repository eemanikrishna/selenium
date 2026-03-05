package org.example.webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// 1. get method to launch the website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// 2. get title
		System.out.println(driver.getTitle());
		// 3. to Get the current URL of the webpage
		System.out.println(driver.getCurrentUrl());
		// 4. to get source code of the page
		System.out.println(driver.getPageSource());
		// 5. to Get the unique window handle ID of the current browser window
		System.out.println(driver.getWindowHandle());
		// 6. to Get all window handles (IDs) of opened browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowHandleId = driver.getWindowHandles();
		System.out.println(windowHandleId);
	}

}
