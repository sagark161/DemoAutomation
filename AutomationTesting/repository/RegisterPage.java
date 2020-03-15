package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath="//h2[text()='Register']")
	WebElement header;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lName;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//label[text()='Phone*']//following::input[1]")
	WebElement phone;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement gender_m;
	
	@FindBy(xpath="//input[@value='FeMale']")
	WebElement gender_f;
	
	@FindBy(xpath="//label[text()='Country*']//following::div[1]")
	WebElement selectCountry;
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void goToReg(){
		driver.findElement(By.id("enterimg")).click();
	}
	
	public boolean headerPresent(){
		return header.isDisplayed();
	}
	
	public void enterDetails(){
		fName.sendKeys("Sumit");
		lName.sendKeys("Koni");
		email.sendKeys("sumit.123@gmail.com");
		phone.sendKeys("1234567890");
		gender_m.click();
		
	}
}
