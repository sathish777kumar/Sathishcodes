package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class1 {
	
	public static void main (String args[]) throws Exception {
		
		String S = getData(0,2);
	}

	public static String getData(int row, int column) throws Exception {
		String value = null;		
		InputStream file1InputStream = new FileInputStream (new File("C:\\Users\\Sathish\\Desktop\\Testdata.xlsx"));
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1InputStream);
		XSSFSheet sheet = workbook1.getSheetAt(0);
		XSSFCell cels = sheet.getRow(row).getCell(column);
		
		CellType type = cels.getCellType();
		
		if (type ==CellType.STRING){
			
			value = cels.getStringCellValue();
			System.out.println(value);
		}
		
		return value;
		}
	}
	
