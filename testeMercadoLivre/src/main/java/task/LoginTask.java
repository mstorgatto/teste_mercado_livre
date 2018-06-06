package task;

import org.openqa.selenium.WebDriver;
import appObjects.LoginAppObject;

public class LoginTask {

	private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);	
	}
	public void EnterMercadoLivre () {
		this.loginAppObject.getEnterButton().click();
	}
//	public void NewUsernameMercadoLivre () {
//		this.loginAppObject.getNewUserButton().click();
//	}
	public void UsernameMercadoLivre (String username) {
		this.loginAppObject.getUsernameTextField().sendKeys(username);
	}
	public void UsernameMercadoLivre2 () {
		this.loginAppObject.getUsernameButton().click();
	}
	public void PasswordMercadoLivre (String password) {
		this.loginAppObject.getPasswordTextField().sendKeys(password);
	}
	public void PasswordMercadoLivre2 () {
		this.loginAppObject.getPasswordButton().click();
	}
	
}
