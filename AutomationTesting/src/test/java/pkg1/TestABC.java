package pkg1;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import repository.HomePage;
import repository.RegisterPage;

public class TestABC extends BaseClass {
	/*HomePage homePage;
	RegisterPage registerPage;

	@BeforeMethod(dependsOnMethods={"setUp"})
	public void pageRepoLoad(){
		registerPage = PageFactory.initElements(driver, RegisterPage.class);	
	}

	@Test
	public void scenarioXYZ() {
		registerPage.goToReg();
		Assert.assertTrue(registerPage.headerPresent());
	}*/
}
