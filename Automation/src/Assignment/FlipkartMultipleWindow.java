package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class FlipkartMultipleWindow 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://www.zomato.com/india");
	WebElement AllLinks=driver.findElement(By.xpath("//p[text()='Privacy']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",AllLinks );
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
   java.util.Set<String> allwindowId=driver.getWindowHandles();
	
	for(String id:allwindowId)
	{
		driver.switchTo().window(id);
		
		if(driver.getTitle().contains("Zomato | LinkedIn"))
		{
			break;
		}
		else 
		{
			driver.close();
		}
	}
}}

