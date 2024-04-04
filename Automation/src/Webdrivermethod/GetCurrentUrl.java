package Webdrivermethod;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;


public class GetCurrentUrl 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.meesho.com/";
	if(actualurl.equals(expectedurl))
    {
		System.out.println("url is correct");
    }
	else 
	{
		System.out.println("url is wrong");
    }
	driver.close();
}
}
