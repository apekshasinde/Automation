package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import POM.CreateNewUserPage;
import POM.HomePage;
import POM.LoginPage;
import POM.UserListPage;

public class CreateUser extends BaseTest
{


@Test
public void createUser() throws EncryptedDocumentException, IOException
{
// login
	Flib lib=new Flib();
	String usernmae=lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
	String password=lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
	LoginPage lp=new LoginPage(driver);
	lp.validLogin(usernmae, password);
	
	//fetch the user data
	WorkLib wl=new WorkLib();
	String usn=lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 0)+wl.getRandomNum();
	String pwd=lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 1)+wl.getRandomNum();
	String frstnm=lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 2)+wl.getRandomNum();
	String lastnm=lib.getDataFromExcelFile(EXCEL_PATH, USERSHEETNAME, 1, 3)+wl.getRandomNum();
	
	
	//TO ACCESS METHOD OF HOMEPAGE CLASS
	HomePage hp=new HomePage(driver);
	hp.clickOnUserLink();
	
	//TO ACCESS A METHOD OF USERLISTPAGE CLASS
	
	UserListPage ulp=new UserListPage(driver);
	ulp.clickOnCreateNewButton();
	
	//TO ACCESS A METHOD OF  CreateNewUserPage
	
	 CreateNewUserPage cnu=new  CreateNewUserPage(driver);
	 cnu.createUser(usn, pwd, frstnm, lastnm);
	 
	 
	 hp.clickOnLogoutLink();
}
}
