package com.example.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[6]/footer/section[1]/div/div[1]/ul/li[4]/a")).click();
		Set<String> windowIdSet = driver.getWindowHandles();
//		for(String s: windowIdSet) {
//			System.out.println(s);
//		}
		List<String> windowList = new ArrayList(windowIdSet);
		String parentString = windowList.get(0);
		String childString = windowList.get(1);
		
		driver.switchTo().window(childString);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentString);
		System.out.println(driver.getTitle());
	}
}
