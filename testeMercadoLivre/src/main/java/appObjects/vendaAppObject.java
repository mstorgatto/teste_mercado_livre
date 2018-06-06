package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class vendaAppObject {

	private WebDriver driver;
	
	public vendaAppObject(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEnterButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/a[2]"));	
	}
	public WebElement getUsernameTextField() {
		return this.driver.findElement(By.id("user_id"));	
	}
	
	public WebElement getUsernameButton() {
		return this.driver.findElement(By.cssSelector("#login_user_form > div.ui-form__actions > input"));	
	}
	
	public WebElement getPasswordTextField() {
		return this.driver.findElement(By.id("password"));	
	}
	
	public WebElement getPasswordButton() {
		return this.driver.findElement(By.id("action-complete"));
	}
		
	public WebElement getSellButton() {
		return this.driver.findElement(By.xpath("/html/body/header/div/div[2]/div/ul/li[6]/a"));
	}
	
//	public WebElement getNewSellButton() {
//		return this.driver.findElement(By.cssSelector("#newListing"));
//	}
	
	public WebElement getTypeButton() {
		return this.driver.findElement(By.cssSelector("#SERVICES > button"));
	}
	
	public WebElement get2TypeButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/nav/a[3]"));
	}
	
	public WebElement getBeautyButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[1]/select/option[3]"));
	}
	
	public WebElement getClinicButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[2]/select/option[2]"));
	}

	public WebElement getMassageButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[3]/select/option[3]"));
	}

	public WebElement getDoneButton() {
		return this.driver.findElement(By.cssSelector("body > main > div > div > form > div > div.category-container.verticalName.platform-ML > div.category-column.actions.lastField > input.ch-btn.ch-btn-large"));
	}

	public WebElement getTitleTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"title\"]"));
	}
	
	public WebElement getIncludedTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"included\"]"));
	}
	
	public WebElement getNotIncludedTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"not_included\"]"));
	}
	
	public WebElement getConfirmButton() {
		return this.driver.findElement(By.cssSelector("#_eventId_next"));
	}
	
	public WebElement getdropdownState() {
		return this.driver.findElement(By.id("state"));	
	}
	
	public WebElement getdropdownCity() {
		return this.driver.findElement(By.id("city"));	
	}
	
	public WebElement getdropdownNeighborhood() {
		return this.driver.findElement(By.id("neighborhood"));	
	}
	
	public WebElement getStreetTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"location-street\"]"));
	}
	
	public WebElement getHouseNumberTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"location-number\"]"));
	}
	
	public WebElement getPhoneTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"telephone\"]"));	
	}
	
	public WebElement getPriceButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"priceOption\"]"));
	}
	
	public WebElement getPriceTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"price\"]"));
	}
	
	public WebElement getContButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
	}
	
	public WebElement getSellTypeButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"free\"]"));
	}
	
	public WebElement getSaleButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"free\"]"));
	}
	
	public WebElement getConfirmSaleButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
	}
	
	public WebElement getCPFTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"signUp_IDNumber\"]"));
	}
	
	public WebElement getPhone2Button() {
		return this.driver.findElement(By.xpath("//*[@id=\"signupPhoneNumberSyi\"]"));
	}
	public WebElement getSellFinalButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"submit-address\"]"));
	}
	
}
