package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewInsuranceConfirmation {
	WebDriver driver;

	By allInfoIsCorrectCheckbox = By.xpath("//span[text()='All information is correct.']");

	By rgpdCheckbox = By.xpath("//span[text()='The customer consents that his personal data "
			+ "will be transmitted to and processed by simplesurance GmbH for the fulfilment "
			+ "of the insurance contract.']");

	By policyCreateCheckbox = By.xpath("//span[text()='policyCreate.form.confirmation2_undefined']");

	By insuredProductNOT14daysCheckbox = By.xpath("//span[text()='Insured product is not older than 14 days.']");

	By createInsuranceButton = By.xpath("//button//span[text()='Create insurance']");

	public CreateNewInsuranceConfirmation(WebDriver driver) {
		this.driver = driver;
	}

	public void infoConfirmation() {
		System.out.println("Clicking confirmation checkboxes...");
		driver.findElement(allInfoIsCorrectCheckbox).click();
		driver.findElement(rgpdCheckbox).click();
		driver.findElement(policyCreateCheckbox).click();
		driver.findElement(insuredProductNOT14daysCheckbox).click();
		System.out.println("All checkboxes clicked!");
		driver.findElement(createInsuranceButton).click();
		System.out.println("Confirmation submited!");
	}
}
