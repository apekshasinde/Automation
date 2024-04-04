package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	WebElement multi=driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(multi);
	s.selectByIndex(1);
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.deselectByValue("Germany");
	s.deselectByValue("Poland");
	
}
}
