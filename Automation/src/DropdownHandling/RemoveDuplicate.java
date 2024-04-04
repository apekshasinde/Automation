package DropdownHandling;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate 
{
public static void main(String[] args)
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/akank/OneDrive/Desktop/MultipleDropdown.html");
	
	Select s=new Select(driver.findElement(By.id("dropdown")));
 List<WebElement> duplicateOptions= s.getOptions();
   
	 TreeSet<String> set=new TreeSet<String>();
	 
	 for(int i=0;i<duplicateOptions.size();i++)
	 {
		 String duplicate=duplicateOptions.get(i).getText();
		 set.add(duplicate);
	 }
	 for(String options:set)
	 {
		 System.out.println(options);
	 }
			
}
}
	