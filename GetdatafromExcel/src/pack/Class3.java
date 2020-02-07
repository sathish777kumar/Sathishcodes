package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class3 {
		
	public static void main (String args[]) throws Exception {
		
		String D = getdata(1,1);
		
		
	}
		
		public static String getdata(int row, int column) throws Exception {
		
		String value = null;
		
		InputStream File1InputStream = new FileInputStream (new File("C:\\Users\\Sathish\\Desktop\\Testdata.xlsx"));
		XSSFWorkbook book1 = new XSSFWorkbook(File1InputStream);
		XSSFSheet sheet1 = book1.getSheetAt(0);
		XSSFCell cell1 = sheet1.getRow(row).getCell(column);
		CellType type = cell1.getCellType();
		
		if (type == CellType.STRING){
		
			value = cell1.getStringCellValue();
			
			System.out.println(value);
	}
		return value;

}
}
