package ScreenShotHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotByDoingDownCasting
{
public static void main(String[] args) throws IOException 
{
	

	WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
    ChromeDriver driver2=(ChromeDriver)driver;
    driver.manage().window().maximize();
  
File from=driver2.getScreenshotAs(OutputType.FILE);
    File file=new File("./screenshot/image2YouTube.png");
    Files.copy(from,file);
}
}