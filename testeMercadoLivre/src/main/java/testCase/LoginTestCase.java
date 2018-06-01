package testCase;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import verificationPoints.LoginVerificationPoint;


public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoint verificationpoint;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.mercadolivre.com.br/");
		this.driver.manage().window().maximize();
		WebElement contaButton = this.driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/a[2]"));
		contaButton.click();
		
		this.verificationpoint = new LoginVerificationPoint(driver);
		
	} 
		

	@Test
	public void testMain () throws InterruptedException {
			
		WebElement usernameTextField = this.driver.findElement(By.id("user_id"));
		WebElement usernameButton = this.driver.findElement(By.xpath("//*[@id=\"login_user_form\"]/div[2]/input"));
		
		//usernameTextField.sendKeys("mstorgatto@gmail.com");
		usernameTextField.sendKeys("marina_storgatto@hotmail.com");
		usernameButton.click();

		Thread.sleep(1000);
		
		WebElement passwordTextField = this.driver.findElement(By.id("password"));
		WebElement passwordButton = this.driver.findElement(By.id("action-complete"));
				
		passwordTextField.sendKeys("Amor1963");
		passwordButton.click();
		
		Thread.sleep(1000);
		
		WebElement sellButton = this.driver.findElement(By.xpath("/html/body/header/div/div[2]/div/ul/li[6]/a"));
		sellButton.click();
		
		Thread.sleep(1000);
		
		WebElement newsellButton = this.driver.findElement(By.xpath("//*[@id=\"newListing\"]"));
		newsellButton.click();
		
		Thread.sleep(1000);
		
		WebElement typeButton = this.driver.findElement(By.cssSelector("#SERVICES > button"));
		typeButton.click();
		
		Thread.sleep(1000);
		
		WebElement ctypeButton = this.driver.findElement(By.xpath("/html/body/main/div/div/form/nav/a[3]"));
		ctypeButton.click();
		
		Thread.sleep(1000);
		
		WebElement beautyButton = this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div/select/option[3]"));
		beautyButton.click();
		
		Thread.sleep(1000);
		
		WebElement clinicButton = this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[2]/select/option[2]"));
		clinicButton.click();
		
		Thread.sleep(1000);
		
		WebElement massageButton = this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[3]/select/option[3]"));
		massageButton.click();
		
		Thread.sleep(1000);
	
		WebElement doneButton = this.driver.findElement(By.xpath("/html/body/main/div/div/form/div/div[2]/div[4]/input[5]"));
		doneButton.click();
		
		Thread.sleep(1000);
		
		WebElement titleTextField = this.driver.findElement(By.id("title"));
		WebElement includedTextField = this.driver.findElement(By.id("included"));
		WebElement notIncludedTextField = this.driver.findElement(By.id("not_included"));
		WebElement confirmButton = this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
		
		titleTextField.sendKeys("Massagem Estética");
		includedTextField.sendKeys("Massagem Estética");
		notIncludedTextField.sendKeys("Acupuntura");
		confirmButton.click();
		
		Thread.sleep(1000);
		
		Select dropdownState = new Select(this.driver.findElement(By.id("state")));
		dropdownState.selectByVisibleText("Rio Grande do Sul");
		Thread.sleep(2000);
		
		Select dropdownCity = new Select(this.driver.findElement(By.id("city")));
		dropdownCity.selectByVisibleText("Porto Alegre");
		Thread.sleep(2000);
		
		Select dropdownNeighborhood = new Select(this.driver.findElement(By.id("neighborhood")));
		dropdownNeighborhood.selectByVisibleText("Cristo Redentor");
		
		WebElement streetTextField = this.driver.findElement(By.xpath("//*[@id=\"location-street\"]"));
		streetTextField.sendKeys("Rua Amaragi");
		WebElement houseNumberTextField = this.driver.findElement(By.xpath("//*[@id=\"location-number\"]"));
		houseNumberTextField.sendKeys("62");
		WebElement phoneTextField = this.driver.findElement(By.xpath("//*[@id=\"telephone\"]"));
		phoneTextField.sendKeys("55984170177");
		WebElement priceButton = this.driver.findElement(By.xpath("//*[@id=\"priceOption\"]"));
		priceButton.click();
		WebElement priceTextField = this.driver.findElement(By.xpath("//*[@id=\"price\"]"));
		priceTextField.sendKeys("50000");
		WebElement continButton = this.driver.findElement(By.xpath("//*[@id=\"_eventId_next\"]"));
		continButton.click();
			
		
		
		
		//WebElement estadoIndex = this.driver.findElement(By.id("state"));
		//dropdown.selectByIndex();
		
		
		//loginButton.submit();   //mesma ação que click()
		
		verificationpoint.checkHelloMessage();
	}

	//@After
	//public void tearDown() {
	//this.driver.quit();
	//}
}

