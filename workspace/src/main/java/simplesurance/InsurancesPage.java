package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsurancesPage {
	WebDriver driver;

	By newInsuranceButton = By.xpath("//div[@id='root']//span[text()='New']");
	By importInsurancesButton = By.xpath("//div[@id='root']//span[text()='Import']");
	

	public InsurancesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void newInsurance() {
		driver.findElement(newInsuranceButton).click();
	}
	
	public void importInsurances() {
		driver.findElement(importInsurancesButton).click();
	}
}
