package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.demoblaze.com/");
	driver.findElement(By.id("login2")).click();
	driver.findElement(By.id("loginusername")).sendKeys("apekshas",Keys.TAB,"apekshas",Keys.ENTER);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(2000);
	WebElement samsung=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
	samsung.click();
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	Thread.sleep(2000);

Alert alt=driver.switchTo().alert();
alt.accept();
driver.findElement(By.xpath("//a[text()='Home ']")).click();
driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	Thread.sleep(2000);
Alert alt2	=driver.switchTo().alert();
alt2.accept();
driver.findElement(By.xpath("//a[text()='Cart']")).click();
WebElement expectedPrice=driver.findElement(By.id("totalp"));
WebElement actual=driver.findElement(By.id("totalp"));
if(expectedPrice.equals(actual))
{
	System.out.println("price is same");
}
else
{
	System.out.println("price is not same");
}
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@data-target='#orderModal']")).click();
driver.findElement(By.id("name")).sendKeys("apekshashinde",Keys.TAB,"India",Keys.TAB,"Pune",Keys.TAB,"1234567890",Keys.TAB,"june",Keys.TAB,"2024");	
driver.findElement(By.xpath("//button[text()='Purchase']")).click();
}
}
