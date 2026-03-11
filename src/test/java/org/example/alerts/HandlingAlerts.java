package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		// ok alert
//		Alert myAlert = driver.switchTo().alert();
//		System.out.println(myAlert.getText());
//		myAlert.accept();
		
		// ok cancel alert
//		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
//		Thread.sleep(5000);
//		Alert myAlert2 = driver.switchTo().alert();
//		System.out.println(myAlert2.getText());
//		myAlert2.accept();
////		myAlert2.dismiss();
/// 	
		// input alert
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(5000); 
		Alert myAlert3 = driver.switchTo().alert();
		myAlert3.sendKeys("Welcome");
		myAlert3.accept();
	}
}
