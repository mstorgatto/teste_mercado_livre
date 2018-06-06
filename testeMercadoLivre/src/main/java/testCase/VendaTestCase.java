package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import framework.Drivers;
import framework.Report;
import framework.ScreenShot;
import task.VendaTask;
import verificationPoints.LoginVerificationPoint;

public class VendaTestCase {
	
	private WebDriver driver;
	
	public VendaTask homePage;
	private LoginVerificationPoint verificationPoint;
	
	@Before
	public void setup() {
		Report.startTest("Valid Sell.");
		driver = Drivers.getChromeDriver();
		homePage= new VendaTask (driver);
		verificationPoint = new LoginVerificationPoint(driver);
	}
		
	@Test
	public void testMain() throws InterruptedException {
		this.driver.get("https://www.mercadolivre.com.br/");
		this.driver.manage().window().maximize();
		
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.EnterMercadoLivre();
		Thread.sleep(1000);
		homePage.UsernameMercadoLivre("teste_marina@outlook.com");
		Report.log(Status.INFO,"Send the username.", ScreenShot.capture(driver));
		homePage.UsernameMercadoLivre2();
		Thread.sleep(1000);
		homePage.PasswordMercadoLivre("MarinaStorgatto92");
		Report.log(Status.INFO,"Send the password.", ScreenShot.capture(driver));
		homePage.PasswordMercadoLivre2();
		Thread.sleep(1000);
		Report.log(Status.INFO,"The Login is complete.", ScreenShot.capture(driver));
		homePage.SellMercadoLivre();
		Report.log(Status.INFO,"Enter in the sell menu.", ScreenShot.capture(driver));
//		Thread.sleep(3000);
//		homePage.SellMercadoLivre2();
		Thread.sleep(2000);
		homePage.TypeMercadoLivre();
		Thread.sleep(1000);
		homePage.TypeMercadoLivre2();
		Thread.sleep(1000);
		homePage.TypeMercadoLivre3();
		Thread.sleep(1000);
		homePage.TypeMercadoLivre4();
		Thread.sleep(1000);
		homePage.TypeMercadoLivre5();
		Report.log(Status.INFO,"Select type of product.", ScreenShot.capture(driver));
		Thread.sleep(1000);
		homePage.TypeMercadoLivre6();
		Thread.sleep(1000);
		homePage.SpecMercadoLivre("Massagem Estetica", "Massagem estetica","Acupuntura");
		Report.log(Status.INFO,"Title and specification.", ScreenShot.capture(driver));
		homePage.SpecMercadoLivre1();
		Thread.sleep(1000);
		homePage.SpecMercadoLivre2("Rio Grande do Sul");
		Thread.sleep(4000);
		homePage.SpecMercadoLivre3("Porto Alegre");
		Thread.sleep(4000);
		homePage.SpecMercadoLivre4("Cristo Redentor");
		Report.log(Status.INFO,"Select the dropdown.", ScreenShot.capture(driver));
		Thread.sleep(4000);
		homePage.SpecMercadoLivre5("Rua Amaragi", "62","55984170177", "50000");
		Report.log(Status.INFO,"Complete the address.", ScreenShot.capture(driver));
		homePage.SpecMercadolivre6();
		Thread.sleep(1000);
		homePage.SellTypeMercadoLivre();
		Report.log(Status.INFO,"Select the sell type.", ScreenShot.capture(driver));
		Thread.sleep(1000);
		homePage.ConfSaleMercadoLivre();
		Thread.sleep(1000);
		homePage.FinishSaleMercadoLivre("02956752090", "55984170177");
		Report.log(Status.INFO,"Insert the final data.", ScreenShot.capture(driver));
		Thread.sleep(2000);
		homePage.SellDoneMercadoLivre();
		Report.log(Status.INFO,"The Sell is complete.", ScreenShot.capture(driver));
	
		verificationPoint.checkMercadoLivreMessage();
		}
	
	@After
	public void tearDown() {
		driver.quit();
		}
	
	}
