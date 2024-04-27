package PomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest
{

	public static void main(String[] args) throws IOException 
	{
		BaseTest test=new BaseTest();
		test.setUp();
		LoggInPage lp=new LoggInPage(driver);
		Flib lib=new Flib();
	    lp.validLogin(lib.getDataFromProperty(Prop_Path,"username"),lib.getDataFromProperty(Prop_Path, "password"));
		
		
	}
}
