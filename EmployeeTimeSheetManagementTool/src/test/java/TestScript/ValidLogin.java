package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import POM.LoginPage;

public class ValidLogin extends BaseTest


{
@Test
public void login() throws EncryptedDocumentException, IOException, InterruptedException
{
	Flib lib=new Flib();
	String username=lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME , 1, 0);
	String password=lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME , 1, 1);
	LoginPage lp= new LoginPage(driver);
	
	lp.validLogin(username, password);
	
	
	
	
}
}
