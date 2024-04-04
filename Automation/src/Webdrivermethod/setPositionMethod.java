package Webdrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPositionMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Point point=new Point(300, 300) ;
		driver.manage().window().setPosition(point);
		driver.get("https://www.google.com");
	}
	}


