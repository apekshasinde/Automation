package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("apeksha",Keys.TAB,"apekshashinde2003@gmail.com",Keys.TAB,"lipstick",Keys.TAB,"i like it");
}
}
