package SerachContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemoqspiders
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
	driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
	driver.findElement(By.xpath("//li[text()='Multiline Text Area']")).click();
   WebElement disabled=driver.findElement(By.xpath("//li[text()='Disabled']"));
   
   if(disabled.isEnabled())
		   {
	        System.out.println("textfield is enabled");
		   }

   else {
	   System.out.println("textfield is disabled");
        

	   
   }
       

	
	
	
	
	
   
	
	
	
	
	
	
}
}
