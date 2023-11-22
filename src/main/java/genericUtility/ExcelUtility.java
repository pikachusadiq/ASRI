package genericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class to fetch data from Excel
 */
public class ExcelUtility {
	/**
	 * This is a generic method to fetch data from Excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
    public  String getDataFromExcel(String sheetname,int row,int cell) throws Exception {
    	FileInputStream fis =new FileInputStream(IconstantUtility.excelPath);
    	
    	Workbook book=WorkbookFactory.create(fis);
    	Sheet sh=book.getSheet(sheetname);
    	DataFormatter format=new DataFormatter();
         String cellValue=format.formatCellValue(sh.getRow(row).getCell(cell));
		return cellValue;
         
    }
}