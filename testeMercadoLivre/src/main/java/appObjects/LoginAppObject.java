package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {

	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEnterButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/a[2]"));	
	}
//	public WebElement getNewUserButton() {
//		return this.driver.findElement(By.cssSelector("//*[@id=\"change-user-link\"]"));
//	}
	public WebElement getUsernameTextField() {
		return this.driver.findElement(By.cssSelector("#user_id"));
	}
	
	public WebElement getUsernameButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"login_user_form\"]/div[2]/input"));
		
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("password"));
		
	}
	
	public WebElement getPasswordButton() {
		return this.driver.findElement(By.id("action-complete"));
		
	}
		
			
}
