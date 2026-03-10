package com.example.navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
	}
}
