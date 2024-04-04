package JavaScriptExecutor;

import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XyCoordinate
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/india");
WebElement scroll=driver.findElement(By.xpath("//p[text()='Privacy']"));
org.openqa.selenium.Rectangle size=scroll.getRect();
int X=size.getX();
int Y=size.getY();

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+ X +","+Y+");");
}
}
