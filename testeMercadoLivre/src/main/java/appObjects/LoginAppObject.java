package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {

	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUsernameTextField() {
		return this.driver.findElement(By.id("user_id"));
		
	}
	
	public WebElement getUsernameButton() {
		return this.driver.findElement(By.xpath("//*[@id=\\\"login_user_form\\\"]/div[2]/input"));
		
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("password"));
		
	}
	
	public WebElement getPasswordButton() {
		return this.driver.findElement(By.id("action-complete"));
		
	}
		
			
}
