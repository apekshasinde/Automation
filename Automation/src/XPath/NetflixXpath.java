package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixXpath 
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("apekshashinde2003@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("appu");
	driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
}
}
	
	
	
