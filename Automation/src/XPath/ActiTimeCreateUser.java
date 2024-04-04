package XPath;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCreateUser
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	Random r=new Random();
	int No=r.nextInt(10000);
	driver.manage().window().maximize();
	driver.get("http://laptop-ihbel2ej/login.do");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	driver.findElement(By.xpath("//a[@class='content users']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	String password="123456";
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("apeksha"+No);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("password"+No);
	Thread.sleep(20000);

	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("password"+No);
	Thread.sleep(20000);

	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("apeksha"+No);
	Thread.sleep(20000);

	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("shinde"+No);
	Thread.sleep(20000);

	driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).sendKeys("8:00");
	Thread.sleep(20000);

	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	Thread.sleep(20000);

	driver.quit();
	
}
}
