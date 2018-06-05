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
		Report.startTest("Valid Login.");
		driver = Drivers.getChromeDriver();
		homePage= new VendaTask (driver);
		verificationPoint = new LoginVerificationPoint(driver);
	}
		
	@Test
	public void testMain() throws InterruptedException {
		this.driver.get("https://www.mercadolivre.com.br/");
		this.driver.manage().window().maximize();
		
		Report.log(Status.INFO,"The Website has started.", ScreenShot.capture(driver));
		homePage.LoginMercadoLivre("mstorgatto@gmail.com", "Amor1963");
		
		homePage.VendaMercadoLivre("Massagem Estetica", "Massagem Estetica Modeladora", "Acupuntura", "Rua Amaragi", "62", "55984170177", "50000", "05956752090");
	
		Thread.sleep(2000);
	
		Report.log(Status.INFO,"The Sell is complete.", ScreenShot.capture(driver));
	
		verificationPoint.checkMercadoLivreMessage();
		}
	
	@After
	public void tearDown() {
		driver.quit();
		}
	
	}
