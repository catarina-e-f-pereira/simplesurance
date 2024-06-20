package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewInsuranceCheckoutPaymentDebitInfo {
	WebDriver driver;
	Actions actions;
	
	By accountHolderField = By.name("accountHolder");
	String accountHolder = "John";
	
	By emailField = By.xpath("//input[@name = 'email']");
	String email = "john@mail.com";
	
	By ibanField = By.xpath("//input[@name = 'iban']");
	String iban= "DE89370400440532013000";

	By confirmSEPACheckbox = By.xpath("//input[@type='checkbox']");
	
	By placeOrderButton = By.xpath("//button//span[text()='Place order']");

	public CreateNewInsuranceCheckoutPaymentDebitInfo(WebDriver driver) {
		this.driver = driver;
	}

	public void fillPaymentDebitInfo() {
		System.out.println("Entering debit information...");
		actions = new Actions(driver);

		System.out.println("Entering account holder...");
		driver.findElement(accountHolderField).sendKeys(accountHolder);
		System.out.println("Entering email...");
		driver.findElement(emailField).sendKeys(email);

		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='root']//iframe")));
		
		System.out.println("Entering IBAN...");
		actions.moveToElement(driver.findElement(ibanField)).click().sendKeys(iban).perform();		

		driver.switchTo().defaultContent();
		
		System.out.println("Clicking SEPA confirmation checkboxes...");
		driver.findElement(confirmSEPACheckbox).click();
		driver.findElement(placeOrderButton).click();
		System.out.println("Debit information submited!");
	}
}
