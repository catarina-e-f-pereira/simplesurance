package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewInsuranceCheckoutPaymentCardInfo {
	WebDriver driver;
	Actions actions;
	
	By creditCardNumberField = By.xpath("//input[@class='StripeField--fake']");
	String creditCardNumber = "4242424242424242";
	
	By creditCardExpDateField = By.xpath("//*[@data-elements-stable-field-name = 'cardExpiry']");
	String creditCardExpDate = "1124";
	
	By creditCardCVCField = By.xpath("//*[@data-elements-stable-field-name = 'cardCvc']");
	String creditCardCVC= "124";

	By placeOrderButton = By.xpath("//button//span[text()='Place order']");

	public CreateNewInsuranceCheckoutPaymentCardInfo(WebDriver driver) {
		this.driver = driver;
	}

	public void fillPaymentCardInfo() {
		System.out.println("Entering card information...");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='root']//iframe")));

		actions = new Actions(driver);
		
		System.out.println("Entering card number...");
		actions.moveToElement(driver.findElement(creditCardNumberField)).click().sendKeys(creditCardNumber).perform();
		System.out.println("Entering card expiration date...");
		actions.moveToElement(driver.findElement(creditCardExpDateField)).click().sendKeys(creditCardExpDate).perform();
		System.out.println("Entering card CVC...");
		actions.moveToElement(driver.findElement(creditCardCVCField)).click().sendKeys(creditCardCVC).perform();
		
		driver.switchTo().defaultContent();

		driver.findElement(placeOrderButton).click();
		System.out.println("Card information submited!");

	}
}
