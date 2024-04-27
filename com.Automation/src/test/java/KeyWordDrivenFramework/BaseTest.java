package KeyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest  implements IAutoConstant

{
	static WebDriver driver;
  public void setUp() throws IOException
{
	Flib lib=new Flib();
	String Url=lib.getDataFromProperty(Prop_Path, "url");
	String browser=lib.getDataFromProperty(Prop_Path, "browser");
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

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
	driver.get(Url);
	

}
  
		
  
//close the browse
public void tearDown()
{
	driver.quit();
}


}

