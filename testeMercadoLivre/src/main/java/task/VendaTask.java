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
	public void EnterMercadoLivre () {
		this.vendaAppObject.getEnterButton().click();
	}
	public void UsernameMercadoLivre
	(String username) {
		this.vendaAppObject.getUsernameTextField().sendKeys(username);
	}
	public void UsernameMercadoLivre2
	() {
		this.vendaAppObject.getUsernameButton().click();
	}
	
	public void PasswordMercadoLivre
	(String password) {
		this.vendaAppObject.getPasswordTextField().sendKeys(password);
	}
	public void PasswordMercadoLivre2
	() {
		this.vendaAppObject.getPasswordButton().click();
	}
	
	public void SellMercadoLivre () {
		this.vendaAppObject.getSellButton().click();
	}
	
//	public void SellMercadoLivre2 () {
//		this.vendaAppObject.getNewSellButton().click();
//	}
	
	public void TypeMercadoLivre () {
		this.vendaAppObject.getTypeButton().click();
	}
	
	public void TypeMercadoLivre2 () {
		this.vendaAppObject.get2TypeButton().click();
	}
	public void TypeMercadoLivre3 () {
		this.vendaAppObject.getBeautyButton().click();
	}
	public void TypeMercadoLivre4 () {
		this.vendaAppObject.getClinicButton().click();
	}
	public void TypeMercadoLivre5 () {
		this.vendaAppObject.getMassageButton().click();
	}
	public void TypeMercadoLivre6 () {
		this.vendaAppObject.getDoneButton().click();
	}
	public void SpecMercadoLivre
	(String title, String included, String notincluded) {
		this.vendaAppObject.getTitleTextField().sendKeys(title);
		this.vendaAppObject.getIncludedTextField().sendKeys(included);
		this.vendaAppObject.getNotIncludedTextField().sendKeys(notincluded);
	}
	public void SpecMercadoLivre1
	() {
		this.vendaAppObject.getConfirmButton().click();
	}
	public void SpecMercadoLivre2 (String estado) {
		new Select(this.vendaAppObject.getdropdownState()).selectByVisibleText(estado);
	}
	public void SpecMercadoLivre3 (String cidade) {	
		new Select(this.vendaAppObject.getdropdownCity()).selectByVisibleText(cidade);
	}
	public void SpecMercadoLivre4 (String bairro) {	
		new Select(this.vendaAppObject.getdropdownNeighborhood()).selectByVisibleText(bairro);
	}
//		((Select)this.vendaAppObject.getdropdownState()).selectByVisibleText(estado);
//		((Select)this.vendaAppObject.getdropdownCity()).selectByVisibleText(cidade);
//		((Select)this.vendaAppObject.getdropdownNeighborhood()).selectByVisibleText(bairro);
		//new Select(this....dropdown....).selectBy....
		
	public void SpecMercadoLivre5
	(String street, String housenumber, String phone, String price) {	
		this.vendaAppObject.getStreetTextField().sendKeys(street);
		this.vendaAppObject.getHouseNumberTextField().sendKeys(housenumber);
		this.vendaAppObject.getPhoneTextField().sendKeys(phone);
		this.vendaAppObject.getPriceButton().click();
		this.vendaAppObject.getPriceTextField().sendKeys(price);
		}
	public void SpecMercadolivre6() {
		this.vendaAppObject.getContButton().click();
		}
	public void SellTypeMercadoLivre () {
		this.vendaAppObject.getSellTypeButton().click();
		this.vendaAppObject.getSaleButton().click();
		}
	public void ConfSaleMercadoLivre () {
		this.vendaAppObject.getConfirmSaleButton().click();
		}
	public void FinishSaleMercadoLivre (String cpf, String phone2) {
		this.vendaAppObject.getCPFTextField().sendKeys(cpf);
		this.vendaAppObject.getPhone2Button().sendKeys(phone2);
		}
	public void SellDoneMercadoLivre () {
		this.vendaAppObject.getSellFinalButton().click();
	}
	
		//new Select(this....dropdown....).selectBy....
		//this.loginAppObject.getPasswordTextField().sendKeys(password);
		//this.loginAppObject.getPasswordButton().click();	
		//}
	
}
