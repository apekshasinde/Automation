package Webdrivermethod;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingWithScannerClass {
	static WebDriver driver;
public static void main(String[]args)
{
	
	while(true)
	{
Scanner sc = new Scanner(System.in);
	System.out.println("==enter your browser name==");
	String browser= sc.next();
	if(browser.equals("chrome"))
	{
  driver = new ChromeDriver();
	}
	else if(browser.equals("firefoxDriver"))
	{
		driver=new FirefoxDriver();
		
	}
	else if(browser.equals("edge")) {
		driver=new EdgeDriver();
		
		
	}
	else
	{
		System.out.println("invalid browser");
	}
	}
}

}
