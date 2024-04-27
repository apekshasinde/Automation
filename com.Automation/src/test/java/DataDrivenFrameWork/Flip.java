package DataDrivenFrameWork;

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

public class Flip
{

	public String getDataFromPropertyFile(String FilePath,String Key) throws IOException {
		FileInputStream fis=new FileInputStream(FilePath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
		
	}
	
	public String getDataFromExcelFile(String FilePath,String Sheetname,int rowno,int cellno) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		FileInputStream fis=new FileInputStream(FilePath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(Sheetname);
		    Row row = sheet.getRow(rowno);
		    Cell cell = row.getCell(cellno);
		    String value= cell.getStringCellValue();
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
