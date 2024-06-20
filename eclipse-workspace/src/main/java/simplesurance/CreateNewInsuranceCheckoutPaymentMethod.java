package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewInsuranceCheckoutPaymentMethod {
	WebDriver driver;

	By creditCardCheckbox = By.xpath("//input[@value='STRIPE.CARD']");
	By directDebitCheckbox = By.xpath("//input[@value='STRIPE.DIRECT_DEBIT']");

	By continueToPayButton = By.xpath("//button//span[text()='Continue to pay']");

	public CreateNewInsuranceCheckoutPaymentMethod(WebDriver driver) {
		this.driver = driver;
	}

	public void choosePaymentMethod_card() {
		System.out.println("Choosing CARD as payment method...");
		driver.findElement(creditCardCheckbox).click();
		driver.findElement(continueToPayButton).click();
		System.out.println("Payment method CARD was chosen successfully!");

	}
	
	public void choosePaymentMethod_debit() {
		System.out.println("Choosing DEBIT as payment method...");
		driver.findElement(directDebitCheckbox).click();
		driver.findElement(continueToPayButton).click();
		System.out.println("Payment method DEBIT was chosen successfully!");

	}
}
