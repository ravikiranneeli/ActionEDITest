
package Acmetek.ActionEDI;

import java.io.IOException;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Browser;

public class Login extends Browser {

	//public static Logger log =LogManager.getLogger(Browser.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void userlogin() throws IOException
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.getusername().sendKeys("rneeli@acmetek.com");
		lp.getPassword().sendKeys("Acmetek10");
		lp.getSignIn().click();
	}
	@AfterTest
	public void Teardown() {
		driver.close();
	}

}
