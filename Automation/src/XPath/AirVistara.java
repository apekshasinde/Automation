package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune", Keys.ENTER);
	driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("mumbai",Keys.ENTER);
	driver.findElement(By.xpath("//label[text()='Travel Dates']")).click();
	driver.findElement(By.xpath("//input[@id='departCalendar]")).click();
	driver.findElement(By.xpath("//div[@monthname='Mar']")).click();
	driver.findElement(By.xpath("//a[text()='4']")).click();
}
}
