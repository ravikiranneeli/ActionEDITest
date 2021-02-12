package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By Username=By.xpath("//*[@id=\"logonIdentifier\"]");
	By Password=By.xpath("//*[@id=\"password\"]");
	By SignIn=By.xpath("//*[@id=\"next\"]");
		public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
		public WebElement getusername()
		{
			return driver.findElement(Username);
		}
		public WebElement getPassword()
		{
			return driver.findElement(Password);
		}
	
		public WebElement getSignIn()
		{
			return driver.findElement(SignIn);
		}

}
