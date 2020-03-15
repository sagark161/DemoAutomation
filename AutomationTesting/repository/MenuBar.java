package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBar {
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='WebTable']")
	WebElement webTable;
	
	@FindBy(xpath="//a[text()='SwitchTo']")
	WebElement switchTo;
	
}
