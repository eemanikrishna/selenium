package org.example.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select dropdownCountry = new Select(dropdownElement);
//		dropdownCountry.selectByVisibleText("France");
//		dropdownCountry.selectByValue("AR");
//		dropdownCountry.selectByIndex(2);
		
		// capture options from the dropdown
		List<WebElement> optionElements = dropdownCountry.getOptions();
		System.out.println("Size "+optionElements.size());
		
		// print all options
		for(int i=0;i<optionElements.size();i++) {
			System.out.println(optionElements.get(i).getText());
		}
		
		for(WebElement op:optionElements) {
			System.out.println(op.getText());
		}
		
		
		
		
	}

}
