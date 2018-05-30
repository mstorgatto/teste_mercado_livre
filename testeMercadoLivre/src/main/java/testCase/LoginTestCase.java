package testCase;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		usernameTextField.sendKeys("marina_storgatto@hotmail.com");
		usernameButton.click();

		Thread.sleep(4000);
		
		WebElement passwordTextField = this.driver.findElement(By.id("password"));
		WebElement passwordButton = this.driver.findElement(By.id("action-complete"));
				
		passwordTextField.sendKeys("Amor1963");
		passwordButton.click();
		
		Thread.sleep(4000);
		
		WebElement sellButton = this.driver.findElement(By.xpath("/html/body/header/div/div[2]/div/ul/li[6]/a"));
		sellButton.click();
		
		Thread.sleep(2000);
		
		WebElement typeButton = this.driver.findElement(By.xpath("//*[@id=\"SERVICES\"]/button"));
		typeButton.click();
		
		
		
		//loginButton.submit();   //mesma ação que click()
		
		verificationpoint.checkHelloMessage();
	}

	//@After
	//public void tearDown() {
	//this.driver.quit();
	//}
}

