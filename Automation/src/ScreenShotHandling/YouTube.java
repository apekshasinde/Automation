package ScreenShotHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class YouTube
{
public static void main(String[] args) throws IOException
{
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.youtube.com/");
	
	 File from=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/youtube.png");
	Files.copy(from, dest);
}
}
