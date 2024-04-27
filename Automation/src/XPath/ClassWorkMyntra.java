package XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkMyntra
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com");
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans",Keys.ENTER);
	driver.findElement(By.xpath("//label[text()='Women']")).click();
	driver.findElement(By.xpath("//label[text()='Levis']")).click();
	driver.findElement(By.xpath("//label[text()='Rs. 1049 to Rs. 4500']")).click();
	driver.findElement(By.xpath("//label[text()='Black']")).click();
     WebElement Discount=driver.findElement(By.xpath("//label[text()='10% and above']"));
     for(int i=0;i<5;i++)
    	 
     {
    	 
     }

	
}
}
