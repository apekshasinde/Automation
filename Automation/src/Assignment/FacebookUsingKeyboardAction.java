package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUsingKeyboardAction 
{
public static void main(String[] args) throws AWTException, InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/login/");
	Robot ro=new Robot();
  driver.findElement(By.id("email")).sendKeys("apekshashinde2003@gmail.com");
  ro.keyPress(KeyEvent.VK_CONTROL);
  ro.keyPress(KeyEvent.VK_A);
  ro.keyPress(KeyEvent.VK_C);
 
// to release
  ro.keyRelease(KeyEvent.VK_CONTROL);
  ro.keyRelease(KeyEvent.VK_A);
  ro.keyRelease(KeyEvent.VK_C);
  
  ro.keyPress(KeyEvent.VK_TAB);
  ro.keyRelease(KeyEvent.VK_TAB);
  Thread.sleep(2000);
  ro.keyPress(KeyEvent.VK_CONTROL);
  ro.keyPress(KeyEvent.VK_V);
 








}
}
