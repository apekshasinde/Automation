package GenericLib;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib
{


public String getDataFromPropertyFile(String FilePath,String Key) throws IOException
{
	FileInputStream fis=new FileInputStream(FilePath);
	Properties prop=new Properties();
	prop.load(fis);
	String value =prop.getProperty(Key);
	return value;
}
	
	
	public String getDataFromExcelFile(String filePath, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		return value;

	}
	public int getRowCount(String filePath,String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}

}
