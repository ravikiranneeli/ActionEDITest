package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\smuty\\eclipse-workspace\\ActionEDI\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			if (browserName.contains("headless"))
			{
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver",".\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	//public void getScreenshotPath()
	//{
	//	TakesScreenshot ts=(TakesScreenshot) driver;
	//	ts.getScreenshotAs(target)
		
	//}
}
