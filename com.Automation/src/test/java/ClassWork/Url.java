package ClassWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Url 
{
	public String getDataFromPropertyFile(String FilePath,String Key) throws IOException 
	{
		FileInputStream fis=new FileInputStream(FilePath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
	}
	public String getDataFromExcelFile(String filePath, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		return value;

	}

public int getRowCount(String filePath,String SheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(filePath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(SheetName);
	int rowCount = sheet.getLastRowNum();
	return rowCount;
}

}
