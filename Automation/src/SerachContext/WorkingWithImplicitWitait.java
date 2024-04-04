package SerachContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImplicitWitait 
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.instagram.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.instagram.com");
	driver.findElement(By.name("username")).sendKeys("Apeksha.Shinde.963");
	driver.findElement(By.name("password")).sendKeys("4845");
	
}
}
