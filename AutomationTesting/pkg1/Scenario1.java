package pkg1;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import repository.HomePage;

public class Scenario1 extends BaseClass{
	HomePage homePage;
	
	@BeforeMethod(dependsOnMethods={"setUp"})
	public void pageRepoLoad(){
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void test1() {
		Assert.assertEquals(driver.getTitle(), "Index");
	}

	@Test
	public void test2() {
		homePage.clickSignIn();
		Assert.assertEquals(driver.getTitle(), "SignIn");
	}

	@Test
	public void test3() {
		homePage.clickSkipSignIn();
		Assert.assertEquals(driver.getTitle(), "Register");
	}
}
