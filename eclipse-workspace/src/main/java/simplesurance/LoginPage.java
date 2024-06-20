package simplesurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By usernamelField = By.id("login_username");
	String username = "testsellingpartner1@simplesurance.de";
	By passwordField = By.id("login_password");
	String password = "TestSellingPartner1Pass";
	By submitButton = By.xpath("//button[@type = 'submit']");
	By invertColorsIcon = By.xpath("//*[@data-testid = 'InvertColorsIcon']");
	By languageIcon = By.xpath("//*[@data-testid = 'LanguageIcon']");
	By englishLanguage = By.xpath("//*[@id='language-menu']//li[2]");
	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void changeLanguageToEnglish() {
		System.out.println("Changing language to English...");
		driver.findElement(languageIcon).click();
		driver.findElement(englishLanguage).click();
		System.out.println("Done!");
	}
	
	public void login() {	
		System.out.println("Starting login");
		System.out.println("Entering username...");
		driver.findElement(usernamelField).sendKeys(username);
		System.out.println("Entering password...");
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitButton).click();
		System.out.println("Submiting...");
	}
	
	public void loginSuccessfully() {
		System.out.println("Checking whether login was successful...");
		driver.findElement(invertColorsIcon);	
		System.out.println("Login done sucessfully!");
	}
	

}
