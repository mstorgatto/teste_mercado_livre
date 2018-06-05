package testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import framework.Report;
import testCase.VendaTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	VendaTestCase.class
})
public class VendaTestSuite {
	@BeforeClass
	public static void initTest() {
		Report.create("Mercado Livre", "Testando Login e Venda validos.");
	}
	
	@AfterClass
	public static void endTest() {
		Report.close();
	}
}