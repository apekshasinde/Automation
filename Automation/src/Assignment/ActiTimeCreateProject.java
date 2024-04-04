package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeCreateProject
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=2lj2hla1s4dlp");
	Random r=new Random();
	int No=r.nextInt(10000);
	driver.findElement(By.className("textField")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.className("sizer")).click();
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	driver.findElement(By.name("name")).sendKeys("apeksha"+No);
	driver.findElement(By.name("createCustomerSubmit")).click();
	driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
WebElement dropdown	=driver.findElement(By.name("customerId"));
	Select s=new Select(dropdown);
	s.selectByIndex(1);
	driver.findElement(By.name("name")).sendKeys("autoproject"+No);
	driver.findElement(By.name("createProjectSubmit")).click();
	driver.findElement(By.xpath("//a[text()='All']")).click();
	driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
	driver.findElement(By.xpath("//input[@value='Delete These Customers']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
