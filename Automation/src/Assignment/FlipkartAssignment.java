package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	WebElement fashion=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
	//WebElement jobs=driver.findElement(By.xpath("(//b[@class='caret'])[1]"));
	
	
	Actions act=new Actions(driver);
	act.moveToElement(fashion).perform();
	driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();
	WebElement info=driver.findElement(By.xpath("(//div[@class='_2B099V'])[1]"));
	System.out.println(info.getText());
	driver.findElement(By.xpath("//a[text()='Careers']")).click();
	WebElement jobs1=driver.findElement(By.xpath("(//b[@class='caret'])[1]"));
	act.moveToElement(jobs1).perform();
	
	
driver.findElement(By.xpath("(//a[text()='Jobs @ India'])[1]")).click();
driver.findElement(By.xpath("(//a[text()='Candidate Login'])[1]")).click();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("appushinde",Keys.ENTER);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2582",Keys.ENTER);
driver.findElement(By.xpath("//div[@class='rc-anchor-logo-text']")).click();
}
}
