package ClassWork;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingMultipleApps 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		
		
		
		
for(int i=1;i<=5;i++)
	{
	
	Url ur=new Url();
	
	String url=ur.getDataFromExcelFile("./src/test/resources/Url1.xlsx","applications",i,0);
	System.out.println(url);
	
	    driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);
		
		
		}
		
	}

}
