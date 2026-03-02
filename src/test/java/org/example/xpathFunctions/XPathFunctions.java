package org.example.xpathFunctions;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		// 1. relative xpath
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Mobiles");
		// 2. absolute xpath
		driver.findElement(By.xpath("/html/body/div[6]/header/div[2]/div[2]/form/input")).sendKeys("Mobiles");
		// 3. relative xpath 2
		driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("Cars");
		// 4. multiple attributes
		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Mobilee");
		// 5. and operator
		driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Mobilee");
		// 6. or operator
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search store']")).sendKeys("Mobilee");
		// 7. inner text --> Computers
		boolean textStatus = driver.findElement(By.xpath("//a[text()=\"Computers\"]")).isDisplayed();
		System.out.println(textStatus);
		// 8. contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Mobiles");
		// 9. starts-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mobiles");
		// 10. chained xpath
		boolean imageStatus = driver.findElement(By.xpath("//div[@class=\"picture\"]/a/img")).isDisplayed();
		System.out.println(imageStatus);
	}

}
