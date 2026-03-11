package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//span[@role=\"checkbox\"]")).click();
		
		List<WebElement> checkboxesElements = driver.findElements(By.xpath("//span[@role=\"checkbox\"]"));
		for(int i=0;i<checkboxesElements.size();i++) {
			checkboxesElements.get(i).click();
		}
		for(WebElement c:checkboxesElements) {
			c.click();
		}
		
		
	}

}
