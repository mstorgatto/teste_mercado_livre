package task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import appObjects.LoginAppObject;
import appObjects.vendaAppObject;

public class Login {

	private vendaAppObject loginAppObject;
	
	public Login(WebDriver driver) {
		this.loginAppObject = new vendaAppObject(driver);		
	}
	
	public void LoginMercadoLivre(String username, String password) {
		this.loginAppObject.getUsernameTextField().sendKeys(username);
		this.loginAppObject.getUsernameButton().click();
		this.loginAppObject.getPasswordTextField().sendKeys(password);
		this.loginAppObject.getPasswordButton().click();
		
	}
	public void VendaMercadoLivre
	(String title, String included, String notincluded, String passwordbutton, String street, String housenumber, String phone ) {
		this.loginAppObject.getSellButton().click();
		this.loginAppObject.getNewSellButton().click();
		this.loginAppObject.getTypeButton().click();
		this.loginAppObject.get2TypeButton().click();
		
		this.loginAppObject.getBeautyButton().click();
		this.loginAppObject.getClinicButton().click();
		this.loginAppObject.getMassageButton().click();
		this.loginAppObject.getDoneButton().click();
		
		this.loginAppObject.getTitleTextField().sendKeys(title);
		this.loginAppObject.getIncludedTextField().sendKeys(included);
		this.loginAppObject.getNotIncludedTextField().sendKeys(notincluded);
		this.loginAppObject.getConfirmButton().click();
		((Select)this.loginAppObject.getdropdownState()).selectByVisibleText("Rio Grande do Sul");
		((Select)this.loginAppObject.getdropdownCity()).selectByVisibleText("Rio Grande do Sul");
		((Select)this.loginAppObject.getdropdownNeighborhood()).selectByVisibleText("Rio Grande do Sul");
		//new Select(this....dropdown....).selectBy....
		this.loginAppObject.getStreetTextField().sendKeys(street);
		this.loginAppObject.getHouseNumberTextField().sendKeys(housenumber);
		this.loginAppObject.getPhoneTextField().sendKeys(phone);
		
		
		
		
		//new Select(this....dropdown....).selectBy....
		
		//this.loginAppObject.getPasswordTextField().sendKeys(password);
		//this.loginAppObject.getPasswordButton().click();
		
		
		
		
		
	}
	
}
