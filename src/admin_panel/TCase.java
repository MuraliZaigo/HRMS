package admin_panel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import admin_panel.AdminLogin;

public class TCase {

	public TCase () {
		System.setProperty("webdriver.chrome.driver", "F:\\Murali-Test\\Mine\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://80.211.233.121/zaihrms/login");
		
		AdminLogin login = new AdminLogin(driver);
		
		login.enterMail("admin@admin.com");
		login.enterPassword("password");
		
	}
}
