package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElement 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.dream11.com/");
	
	
	
	WebElement wb=driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
	
	
	driver.switchTo().frame(wb);
	
	
	
	driver.findElement(By.id("regEmail")).sendKeys("57548554");
	
	
	
	
}
}
