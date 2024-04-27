package GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	public static WebDriver sdriver;
    @Parameters("browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome")String browser) throws IOException {
		Flib lib = new Flib();
		String Url = lib.getDataFromPropertyFile(Prop_Path, "url");
		//String browser = lib.getDataFromPropertyFile(Prop_Path, "browser");
		Reporter.log("===========Launching" + browser + "================", true);
		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		} 
		
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		} 
		
		else if (browser.equals("edge")) 
		{
			driver = new EdgeDriver();
		} 
		
		else 
		{
			System.out.println("Invalid browser");
		}
sdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Url);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}