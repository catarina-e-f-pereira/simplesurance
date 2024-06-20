package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewInsuranceCustomer {
	WebDriver driver;

	By salutationCheckboxMaleValue = By.xpath("//input[@value='male']");

	By firstNameField = By.xpath("//*[@data-testid = 'input-createCertificate_firstName']");
	String firstName = "John";

	By lastNameField = By.xpath("//*[@data-testid = 'input-createCertificate_lastName']");
	String lastName = "John";

	By emailField = By.xpath("//*[@data-testid = 'input-createCertificate_email']");
	String email = "test@test.com";

	By streetField = By.xpath("//*[@data-testid = 'input-createCertificate_streetName']");
	String street = "John's street";

	By houseNumberField = By.xpath("//*[@data-testid = 'input-createCertificate_streetNumber']");
	String houseNumber = "A1";

	By postalCodeField = By.xpath("//*[@data-testid = 'input-createCertificate_zip']");
	String postalCode = "2100";

	By cityField = By.xpath("//*[@data-testid = 'input-createCertificate_city']");
	String city = "Berlin";

	By countryField = By.xpath("//*[@data-testid = 'input-createCertificate_country']");
	String country = "DE";

	By taxCodeField = By.xpath("//*[@data-testid = 'input-createCertificate_taxCode']");
	String taxCode = "1";

	By nextButton = By.xpath("//button//span[text()='Next']");

	public CreateNewInsuranceCustomer(WebDriver driver) {
		this.driver = driver;
	}

	public void fillCustomerInfo() {
		System.out.println("Entering customer information...");
		driver.findElement(salutationCheckboxMaleValue).click();

		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(lastNameField).sendKeys(lastName);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(streetField).sendKeys(street);
		driver.findElement(houseNumberField).sendKeys(houseNumber);
		driver.findElement(postalCodeField).sendKeys(postalCode);
		driver.findElement(cityField).sendKeys(city);
		driver.findElement(countryField).sendKeys(country);
		driver.findElement(taxCodeField).sendKeys(taxCode);
		System.out.println("Customer information entered successfully!");

		driver.findElement(nextButton).click();
		System.out.println("Customer information submited!");
	}
}
