package WebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Window;

public class MaximizeBrowser 
{
	
	public static void main(String[] args)
	{
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	
	}

}
