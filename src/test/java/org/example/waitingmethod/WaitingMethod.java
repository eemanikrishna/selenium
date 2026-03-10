package com.example.waitingmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitingMethod {
	public static void main(String[] args) {
		// 1. implicit wait
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");

	}

}
