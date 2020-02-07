package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class4 {
	
	public static void main (String args[]) throws Exception {
		
		double value;
		
		InputStream File1inputstream = new FileInputStream(new File("C:\\Users\\Sathish\\Desktop\\Testdata.xlsx"));
		XSSFWorkbook book1 = new XSSFWorkbook(File1inputstream);
		XSSFSheet sheet1 = book1.getSheetAt(1);
		XSSFCell cell1 = sheet1.getRow(2).getCell(2);
		CellType type = cell1.getCellType();
		
		if(type == CellType.NUMERIC){
			
			value = cell1.getNumericCellValue();
			System.out.println(value);
		}
	}

}
