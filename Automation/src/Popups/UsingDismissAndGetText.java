package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDismissAndGetText
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	driver.findElement(By.id("buttonAlert5")).click();
Alert alt	=driver.switchTo().alert();
String text=alt.getText();
System.out.println(text);
Thread.sleep(2000);
alt.dismiss();

}
}
