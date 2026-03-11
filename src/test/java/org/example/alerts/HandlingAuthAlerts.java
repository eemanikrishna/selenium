package alerts;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthAlerts {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// actual url
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// syntax for username and password
		// https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
	}
}
