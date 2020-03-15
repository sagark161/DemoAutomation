package pkg1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import repository.HomePage;
import repository.MenuBar;

public class Scenario3 extends BaseClass{
	HomePage homePage;
	MenuBar menuBar;
	
	@BeforeMethod(dependsOnMethods="setUp")
	public void pageRepoLoad(){
		
	}
	
	@Test
	public void test1(){
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickSkipSignIn();
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		menuBar.hoverSwitchToAndClickAlerts();
	}
}
