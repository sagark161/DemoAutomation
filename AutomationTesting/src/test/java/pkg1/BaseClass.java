package pkg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import repository.BrowserFactory;

public class BaseClass {
	Properties prop;
	FileInputStream fis;
	WebDriver driver;
	
	@BeforeClass
	public void propLoader() throws IOException{
	prop = new Properties();
	fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\appConfig.properties");
	prop.load(fis);
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		driver = BrowserFactory.launchApplication(driver,
				prop.getProperty("browser"), prop.getProperty("appURL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
