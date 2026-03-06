package org.example.conditionaldriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.python.org/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"python™\"]"));
		System.out.println(logo.isDisplayed());
		// isEnabled()
		WebElement input = driver.findElement(By.xpath("//input[@id=\"id-search-field\"]"));
		System.out.println(input.isEnabled());
		// isSelected
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Beginner’s Guide')]"));
		System.out.println(link.isSelected());
		
	}

}
