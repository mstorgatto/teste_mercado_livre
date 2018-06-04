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
		
	public WebElement getSellButton() {
		return this.driver.findElement(By.xpath("/html/body/header/div/div[2]/div/ul/li[6]/a"));
	}
	
	public WebElement getNewSellButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"newListing\"]"));
	}
	
	public WebElement getTypeButton() {
		return this.driver.findElement(By.cssSelector("#SERVICES > button"));
	}
	
	public WebElement get2TypeButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/nav/a[3]"));
	}
	
	public WebElement getBeautyButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div/select/option[3]"));
	}
	
	public WebElement getClinicButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[2]/select/option[2]"));
	}

	public WebElement getMassageButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[3]/select/option[3]"));
	}

	public WebElement getDoneButton() {
		return this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[4]/input[5]"));
	}

	public WebElement getTitleTextField() {
		return this.driver.findElement(By.id("title"));
	}
	
	public WebElement getIncludedTextField() {
		return this.driver.findElement(By.id("included"));
	}
	
	public WebElement getNotIncludedTextField() {
		return this.driver.findElement(By.id("not_included"));
	}
	
	public WebElement getConfirmButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
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
	
	public WebElement getPriceTextfield() {
		return this.driver.findElement(By.xpath("//*[@id=\"price\"]"));
	}
	
	public WebElement getContinButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
	}
	
	public WebElement getSellTypeButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"free\"]"));
	}
	
	public WebElement getSaleTypeButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"free\"]"));
	}
	
	public WebElement getConfirmSaleButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
	}
	
	public WebElement getCPFTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"signUp_IDNumber\"]"));
	}
	
	public WebElement getAdressButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"953651525\"]"));
	}
	
}
