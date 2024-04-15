package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class flipkart
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("water bottle",Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[text()='NIRLON Summer Cool Single Wall Stainless Steel Fridge W...'])[1]")).click();
		
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
	java.util.Set<String> AllwindowId = driver.getWindowHandles();
	
	for(String id:AllwindowId)
	{
		driver.switchTo().window(id);
		if(driver.getTitle().contains("NIRLON Summer Cool Single Wall Stainless Steel Fridge Water Bottle 1000 ml Bottle "))
		{
			break;
			
		}
	}
	
	Thread.sleep(2000);
	
	driver.findElement(By.className("_1KOMV2")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().window(parent);
	
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	
	
	
	
		
		
		
	}
	
	
	
	
}
