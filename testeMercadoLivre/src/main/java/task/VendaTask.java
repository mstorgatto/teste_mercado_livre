package task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import appObjects.LoginAppObject;
import appObjects.vendaAppObject;

public class VendaTask {

	private vendaAppObject vendaAppObject;
	
	public VendaTask(WebDriver driver) {
		this.vendaAppObject = new vendaAppObject(driver);		
	}
	public void LoginMercadoLivre
	(String username, String password) {
		this.vendaAppObject.getUsernameTextField().sendKeys(username);
		this.vendaAppObject.getUsernameButton().click();
		this.vendaAppObject.getPasswordTextField().sendKeys(password);
		this.vendaAppObject.getPasswordButton().click();
	}
	
	public void VendaMercadoLivre
	(String title, String included, String notincluded, String street, String housenumber, String phone,  String price, String cpf ) {
		this.vendaAppObject.getSellButton().click();
		this.vendaAppObject.getNewSellButton().click();
		this.vendaAppObject.getTypeButton().click();
		this.vendaAppObject.get2TypeButton().click();
		this.vendaAppObject.getBeautyButton().click();
		this.vendaAppObject.getClinicButton().click();
		this.vendaAppObject.getMassageButton().click();
		this.vendaAppObject.getDoneButton().click();
		this.vendaAppObject.getTitleTextField().sendKeys(title);
		this.vendaAppObject.getIncludedTextField().sendKeys(included);
		this.vendaAppObject.getNotIncludedTextField().sendKeys(notincluded);
		this.vendaAppObject.getConfirmButton().click();
		((Select)this.vendaAppObject.getdropdownState()).selectByVisibleText("Rio Grande do Sul");
		((Select)this.vendaAppObject.getdropdownCity()).selectByVisibleText("Rio Grande do Sul");
		((Select)this.vendaAppObject.getdropdownNeighborhood()).selectByVisibleText("Rio Grande do Sul");
		//new Select(this....dropdown....).selectBy....
		this.vendaAppObject.getStreetTextField().sendKeys(street);
		this.vendaAppObject.getHouseNumberTextField().sendKeys(housenumber);
		this.vendaAppObject.getPhoneTextField().sendKeys(phone);
		this.vendaAppObject.getPriceButton().click();
		this.vendaAppObject.getPriceTextField().sendKeys(price);
		this.vendaAppObject.getContButton().click();
		this.vendaAppObject.getSellTypeButton().click();
		this.vendaAppObject.getSaleButton().click();
		this.vendaAppObject.getConfirmSaleButton().click();
		this.vendaAppObject.getCPFTextField().sendKeys(cpf);
		this.vendaAppObject.getAdressButton().click();
				
		//new Select(this....dropdown....).selectBy....
		//this.loginAppObject.getPasswordTextField().sendKeys(password);
		//this.loginAppObject.getPasswordButton().click();	
	}
	
}
