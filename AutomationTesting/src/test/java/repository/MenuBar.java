package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuBar {
	WebDriver driver;
	Actions act = new Actions(driver);
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='WebTable']")
	WebElement webTable;
	
	@FindBy(xpath="//a[text()='SwitchTo']")
	WebElement switchTo;
	
	@FindBy(xpath="//a[text()='Alerts']")
	WebElement alerts;
	
	public MenuBar(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickHome(){
		home.click();
	}
	
	public void clickRegister(){
		register.click();
	}
	
	public void hoverSwitchToAndClickAlerts(){
		act.moveToElement(switchTo).perform();
		alerts.click();
	}
}
