package pkg1;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import repository.HomePage;
import repository.RegisterPage;

public class Scenario2 extends BaseClass{
	HomePage homePage;
	RegisterPage registerPage;

	@BeforeMethod(dependsOnMethods={"setUp"})
	public void pageRepoLoad(){
		registerPage = PageFactory.initElements(driver, RegisterPage.class);
		registerPage.goToReg();
	}

	@Test
	public void test1() {
		Assert.assertTrue(registerPage.headerPresent());
	}
	@Test
	public void test2(){
		registerPage.enterDetails();
	}
}
