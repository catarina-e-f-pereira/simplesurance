package simplesurance;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateSingleInsuranceWithCardTestRunner {

	WebDriver driver;
	LoginPage objLoginPage;

	InsurancesPage objInsurancesPage;
	CreateNewInsuranceProduct objCreateNewInsuranceProduct;
	CreateNewInsuranceCustomer objCreateNewInsuranceCustomer;
	CreateNewInsuranceConfirmation objCreateNewInsuranceConfirmation;

	CreateNewInsuranceCheckoutPaymentMethod objCreateNewInsuranceCheckoutPaymentMethod;
	CreateNewInsuranceCheckoutPaymentCardInfo objCreateNewInsuranceCheckoutPaymentCardInfo;
	CreateNewInsuranceCheckoutPaymentDebitInfo objCreateNewInsuranceCheckoutPaymentDebitInfo;

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
	public void testCreateInsuranceWithCard() {
		objInsurancesPage = new InsurancesPage(driver);
		objCreateNewInsuranceProduct = new CreateNewInsuranceProduct(driver);
		objCreateNewInsuranceCustomer = new CreateNewInsuranceCustomer(driver);
		objCreateNewInsuranceConfirmation = new CreateNewInsuranceConfirmation(driver);
		objCreateNewInsuranceCheckoutPaymentMethod = new CreateNewInsuranceCheckoutPaymentMethod(driver);
		objCreateNewInsuranceCheckoutPaymentCardInfo = new CreateNewInsuranceCheckoutPaymentCardInfo(driver);

		objInsurancesPage.newInsurance();
		objCreateNewInsuranceProduct.fillProductInfo();
		objCreateNewInsuranceCustomer.fillCustomerInfo();
		objCreateNewInsuranceConfirmation.infoConfirmation();
		objCreateNewInsuranceCheckoutPaymentMethod.choosePaymentMethod_card();
		objCreateNewInsuranceCheckoutPaymentCardInfo.fillPaymentCardInfo();
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}

}
