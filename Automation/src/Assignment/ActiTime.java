package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=n89h97qi912c");
	driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
	//driver.findElement(By.name("pwd")).sendKeys("manager",Keys.TAB);
}
}
