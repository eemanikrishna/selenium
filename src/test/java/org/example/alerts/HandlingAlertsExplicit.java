package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertsExplicit {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(5000);
		Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myAlert.getText());
		myAlert.accept();
	}
}
