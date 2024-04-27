package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import POM.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test
public void invalid() throws EncryptedDocumentException, IOException
{
	Flib lib =new Flib();
	
	int rowCount=lib.getRowCount(EXCEL_PATH,INVALIDSHEETNAME);
	for(int i=1;i<=rowCount;i++)
	{

		
   String username=lib.getDataFromExcelFile(EXCEL_PATH, INVALIDSHEETNAME, i, 0);
   String password=lib.getDataFromExcelFile(EXCEL_PATH, INVALIDSHEETNAME, i, 1);
   LoginPage lp=new LoginPage(driver);
   lp.invalidLogin(username, password);
	
}
}
}
