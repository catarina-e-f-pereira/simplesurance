package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewInsuranceProduct {
	WebDriver driver;
	
	By countryField = By.id("country-select");
	By countryOption = By.xpath("//span[text()='Cyprus']");
	
	By productNameField = By.id("product-name-select");
	By productNameOption = By.xpath("//*[@data-value = 'Nokia_v1Allianz_global']");
	
	By tariffField = By.id("tariff-name-select");
	By tariffOption = By.xpath("//*[@data-value = '1-34-Nokia_v1Allianz_global-D-EUR-v1-Accidental_damage']");
			
	
	By insuranceCategoryField = By.id("category-name-select");
	By insuranceCategoryOption = By.xpath("//*[@data-value = 'CATEGORY_SMARTPHONE']");

	
	By periodField = By.id("duration-select");
	By periodOption = By.xpath("//*[@data-value = '12 month(s)']");
	
	By paymentTypeField =  By.id("frequency-select");
	By paymentTypeOption = By.xpath("//span[text()='One-time']");
	
	By deviceClassField = By.id("class-name-select");
	By deviceClassOption = By.xpath("//*[@data-value = 'PDCODE504843']");
	
	By serialNumberField = By.id("input-createCertificate_serialNumber");
	String serialNumber = "123456789";
	
	By deviceNameField = By.id("input-createCertificate_deviceName");
	String deviceName = "SmartPhone";
	
	By invoiceNumberField = By.id("input-createCertificate_invoiceNumber");
	String invoiceNumber = "00001";
	
	By orderNumberField = By.id("input-createCertificate_orderNumber");
	String orderNumber = "1";
	
	By nextButton = By.xpath("//button//span[text()='Next']");
	
	public CreateNewInsuranceProduct(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillProductInfo(){	
	System.out.println("Entering product information...");
	driver.findElement(countryField).click();
	driver.findElement(countryOption).click();
	
	driver.findElement(productNameField).click();
	driver.findElement(productNameOption).click();
	
	driver.findElement(tariffField).click();
	driver.findElement(tariffOption).click();
	
	driver.findElement(insuranceCategoryField).click();
	driver.findElement(insuranceCategoryOption).click();
	
	driver.findElement(periodField).click();
	driver.findElement(periodOption).click();
	
	driver.findElement(paymentTypeField).click();
	driver.findElement(paymentTypeOption).click();
	
	driver.findElement(deviceClassField).click();
	driver.findElement(deviceClassOption).click();
	
	driver.findElement(serialNumberField).sendKeys(serialNumber);
	driver.findElement(deviceNameField).sendKeys(deviceName);
	driver.findElement(invoiceNumberField).sendKeys(invoiceNumber);
	driver.findElement(orderNumberField).sendKeys(orderNumber);
	System.out.println("Product information entered successfully!");
	driver.findElement(nextButton).click();
	System.out.println("Product information submited!");
	}
}


