package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement dropdown=driver.findElement(By.id("select3"));
	Select s=new Select(dropdown);
	s.selectByIndex(1);
	s.selectByIndex(2);
	Thread.sleep(2000);
    s.deselectByIndex(1);
    s.deselectByIndex(2);
}
}
