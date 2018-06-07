package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import task.LoginTask;
import verificationPoints.LoginVerificationPoint;



@RunWith(JUnitParamsRunner.class)

public class LoginTestCase {
	
	private WebDriver driver;
	
	public LoginTask homePage;
	private LoginVerificationPoint verificationPoint;
	public String username;
	public String password;
	
	@Before
	public void setup() {
		Report.startTest("Valid Login.");
		driver = Drivers.getChromeDriver();
		homePage= new LoginTask (driver);
		verificationPoint = new LoginVerificationPoint(driver);
	}
		
	@Test
	@FileParameters ("parameters.csv")
	
	public void testMain(String username, String password) throws InterruptedException {
		
		this.driver.get("https://www.mercadolivre.com.br/");
		this.driver.manage().window().maximize();
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.EnterMercadoLivre();
		Thread.sleep(1000);
//		homePage.NewUsernameMercadoLivre();
//		Report.log(Status.INFO,"Change the username.", ScreenShot.capture(driver));
//		Thread.sleep(1000);
		homePage.UsernameMercadoLivre(username);
		Report.log(Status.INFO,"Send the username.", ScreenShot.capture(driver));
		homePage.UsernameMercadoLivre2();
		Thread.sleep(1000);
		homePage.PasswordMercadoLivre(password);
		Report.log(Status.INFO,"Send the password.", ScreenShot.capture(driver));
		homePage.PasswordMercadoLivre2();
		Thread.sleep(1000);
		Report.log(Status.INFO,"Login is complete.", ScreenShot.capture(driver));
		
		
	
		verificationPoint.checkMercadoLivreMessage();
		}
	
	@After
	public void tearDown() {
		driver.quit();
		}
	
	}
