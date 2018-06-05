package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import task.LoginTask;
import verificationPoints.LoginVerificationPoint;

public class LoginTestCase {
	
	private WebDriver driver;
	
	public LoginTask homePage;
	private LoginVerificationPoint verificationPoint;
	
	@Before
	public void setup() {
		Report.startTest("Valid Login.");
		driver = Drivers.getChromeDriver();
		homePage= new LoginTask (driver);
		verificationPoint = new LoginVerificationPoint(driver);
	}
		
	@Test
	public void testMain() throws InterruptedException {
		this.driver.get("https://www.mercadolivre.com.br/");
		this.driver.manage().window().maximize();
		
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.LoginMercadoLivre("mstorgatto@gmail.com", "Amor1963");
		
		Thread.sleep(2000);
	
		Report.log(Status.INFO,"The Login is complete.", ScreenShot.capture(driver));
	
		verificationPoint.checkMercadoLivreMessage();
		}
	
	@After
	public void tearDown() {
		driver.quit();
		}
	
	}
