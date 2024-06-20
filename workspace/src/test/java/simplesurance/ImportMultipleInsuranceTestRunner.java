package simplesurance;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportMultipleInsuranceTestRunner {

	WebDriver driver;
	LoginPage objLoginPage;
	InsurancesPage objInsurancesPage;
	ImportInsurancePage objImportInsurancePage;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://insurance-manager.sb-qa-candidatetask.sisu.sh/login");

	}

	@Test(priority = 0)
	public void testLogin() {
		objLoginPage = new LoginPage(driver);
		objLoginPage.changeLanguageToEnglish();
		objLoginPage.login();
		objLoginPage.loginSuccessfully();
	}

	@Test(priority = 1)
	public void testImportInsurance() throws InterruptedException {
		objInsurancesPage = new InsurancesPage(driver);
		objImportInsurancePage = new ImportInsurancePage(driver);

		objInsurancesPage.importInsurances();
		objImportInsurancePage.importCSVFile();

		objImportInsurancePage.importWasSuccessful();
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}

}
