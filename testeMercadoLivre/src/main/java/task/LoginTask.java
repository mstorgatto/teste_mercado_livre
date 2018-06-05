package task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import appObjects.LoginAppObject;
import appObjects.vendaAppObject;

public class LoginTask {

	private vendaAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.loginAppObject = new vendaAppObject(driver);		
	}
	public void UsernameMercadoLivre (String username) {
		this.loginAppObject.getUsernameTextField().sendKeys(username);
		this.loginAppObject.getUsernameButton().click();
	}
	public void PasswordMercadoLivre (String password) {
		this.loginAppObject.getPasswordTextField().sendKeys(password);
		this.loginAppObject.getPasswordButton().click();
	}
	
}
