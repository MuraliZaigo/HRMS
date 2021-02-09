package admin_panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLogin {

	WebDriver driver;
	
	public AdminLogin(WebDriver driver) {
		this.driver=driver;
			}
	
	By mail = By.name("email");
	By pwd = By.name("password");
	
	public void enterMail(String name) {
		driver.findElement(mail).sendKeys(name);
	}
	
	public void enterPassword(String character) {
		driver.findElement(pwd).sendKeys(character);
	}
	
}

