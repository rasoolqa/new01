package new01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ReadExcel {

		public static void main(String[] args)  throws IOException {
	{
		
		//String excePath ="./Excel/data.xlsx";
		
		
	        String excelFilePath = "./Excel/data.xlsx";
	        FileInputStream inputStream = new FileInputStream(excelFilePath);
	         
	        Workbook workbook = new XSSFWorkbook(inputStream);
	        org.apache.poi.ss.usermodel.Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	         
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
	        }
	         
	        workbook.close();
	        inputStream.close();
	    }
	 
	}
}

