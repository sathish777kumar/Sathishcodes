package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class2 {
	
	public static void main (String args[])throws Exception {
		
		String S = getdata(1,1);
	}
	
	public static String getdata(int row, int column) throws Exception {
		
		String value = null;
		
		InputStream File1inputstream = new FileInputStream(new File("C:\\Users\\Sathish\\Desktop\\Testdata.xlsx"));
		XSSFWorkbook workbook1 = new XSSFWorkbook(File1inputstream);
		XSSFSheet sheet1 = workbook1.getSheetAt(1);
		XSSFCell cel1 = sheet1.getRow(row).getCell(column);
		CellType type = cel1.getCellType();
		if(type==CellType.STRING){
			
			value = cel1.getStringCellValue();
			
			System.out.println(value);
		}
		
		return value;
		
	}

}
