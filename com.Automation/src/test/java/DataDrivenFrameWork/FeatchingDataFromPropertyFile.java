package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FeatchingDataFromPropertyFile {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
		Properties prop=new Properties();	
		prop.load(fis);
		String url=prop.getProperty("url");
		System.out.println(url);
	}
	

}
