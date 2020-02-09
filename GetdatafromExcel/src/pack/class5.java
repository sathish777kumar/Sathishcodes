package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class5 {
	
	public static void main (String args[]) throws Exception {
		
		
		bet(1,1);
	}
	
	public static void bet(int row, int column) throws Exception {
		
		InputStream FileInput1Stream = new FileInputStream (new File ("C:\\Users\\Sathish\\Desktop\\Testdata.xlsx"));
		
		XSSFWorkbook book1 = new XSSFWorkbook(FileInput1Stream);
		XSSFSheet sheet1 = book1.getSheetAt(0);
		XSSFCell cells = sheet1.getRow(row).getCell(column);
		
		CellType type = cells.getCellType();
		
	if (type == CellType.STRING){
		
		String value = cells.getStringCellValue();
		
		System.out.println(value);
		
	
		}
		
		
		
	}

}
