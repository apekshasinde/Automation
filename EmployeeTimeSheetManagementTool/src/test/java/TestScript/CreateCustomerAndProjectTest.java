package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import POM.ActiveProjectAndCustomerPage;
import POM.CreateNewProjectPage;
import POM.HomePage;
import POM.LoginPage;
import POM.TaskPage;

public class CreateCustomerAndProjectTest extends BaseTest
{

	@Test(groups = {"IT","RT"})
	public void createProjectAndCustomer() throws EncryptedDocumentException, IOException {
		// login
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		// click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnLogoutLink();
		TaskPage otp = new TaskPage(driver);
		otp.CreateProjectAndCustomer();
		ActiveProjectAndCustomerPage apcp = new ActiveProjectAndCustomerPage(driver);
		apcp.clickOnCreateNewCustomerButton();
		WorkLib wlib = new WorkLib();
		String customerName = lib.getDataFromExcelFile(EXCEL_PATH, CUSTOPROSHEET, 1, 0) + wlib.getRandomNum();
		String projectName = lib.getDataFromExcelFile(EXCEL_PATH, CUSTOPROSHEET, 1, 1) + wlib.getRandomNum();
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		cnpp.createCustomerAndProject(driver, customerName, projectName);
		hp.clickOnLogoutLink();

	}

}
