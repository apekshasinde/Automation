package Webdrivermethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingwithQuitMethod
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	driver.findElement(By.xpath("https://www.meesho.com/accessories-men/pl/3tp")).click();
	driver.quit();
}
}
