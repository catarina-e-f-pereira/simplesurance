package simplesurance;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ImportInsurancePage {
	WebDriver driver;
	File csvFile;

	By fileUploadField = By.id("input-csv");
	String filePath = "/src/test/resources/testdata.csv";
	By createInsuranceButton = By.xpath("//button//span[text()='Create insurance']");
	
	By policiesTable = By.xpath("//table[@class='MuiTable-root css-1owb465']/tbody/tr");
	List<WebElement> rows; 
	
	By uploadedFileName = By.xpath("//*[text()='testdata.csv']");


	public ImportInsurancePage(WebDriver driver) {
		this.driver = driver;
	}

	public void importCSVFile() {
		System.out.println("Starting to import .csv file");
		csvFile = new File(System.getProperty("user.dir") + filePath);
		System.out.println("Uploading .csv file...");
		driver.findElement(fileUploadField).sendKeys(csvFile.getAbsolutePath());
		System.out.println("File successfully uploaded!");
		driver.findElement(createInsuranceButton).click();
		System.out.println("Import submited!");
	}
	
	public void importWasSuccessful() {
		System.out.println("Checking whether import was successful...");
		rows = driver.findElements(policiesTable);
		int count = rows.size();
		Assert.assertEquals(count, 5);
		driver.findElement(uploadedFileName);
		System.out.println("Import done successfully!");
	}
}
