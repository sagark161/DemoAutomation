package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//img[@src='enter.png']")
	WebElement register_btn;

	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signIn;

	@FindBy(xpath = "//button[text()='Skip Sign In']")
	WebElement skipSignIn;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignIn() {
		signIn.click();
	}
	
	public void clickSkipSignIn(){
		skipSignIn.click();
	}
}
