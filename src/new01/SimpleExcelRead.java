package new01;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleExcelRead {

	public static void main(String[] args) {
		String Excelpath="./Excel/data1.xlsx";
		try{
			
		FileInputStream fis =new FileInputStream(Excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheetAt(0);
		Iterator<Row> iterator=sheet.iterator();
		while(iterator.hasNext())
			{
					Row row=iterator.next();
					Iterator<Cell>  celliterator=row.iterator();
					while(celliterator.hasNext())
					{
						Cell cell=celliterator.next();
						System.out.println(cell.getStringCellValue());
					}
		
		
			}
		
		
		}
		catch (Exception e)
		{
			System.out.println("Unable to read from excel");
		}

	}

}
