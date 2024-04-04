package Webdrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
	    
		Dimension size=driver.manage().window().getSize();
	     System.out.println(size);
	     Point point=driver.manage().window().getPosition();
	     System.out.println(point);
		driver.get("https://www.google.com");
		driver.close();
	}
	}


