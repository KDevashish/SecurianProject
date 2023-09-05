package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	private Workbook book;
	private DataFormatter formatter = new DataFormatter();
	public ExcelUtility() {
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/DataStorage/TestData.xlsx");
			book = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getDataFromExcel(String sheetname, int rownum, int cellnum) {
		
		Cell cell = book.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		return formatter.formatCellValue(cell);
	}
}
