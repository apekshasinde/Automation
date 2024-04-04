package ScreenShotHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Netflix 
{
public static void main(String[] args) throws IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.netflix.com/in/");
	WebElement logo=driver.findElement(By.xpath("//span[@data-uia='nmhp-card-header+logo']"));
	
	File src=logo.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/logo.png");
	Files.copy(src, dest);
}
}

