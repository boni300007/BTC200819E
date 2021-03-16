package solution;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Helper {
	FileInputStream f;
	XSSFWorkbook book;
	XSSFSheet sheet;
	Object [] [] o;
	//@Test(dataProvider = "d")
	public void test(Object o, Object o1) {
		o = 1;
		o1 = 1;
		System.out.println(o);
		System.out.println(o1);
	}
	
	
	
	@DataProvider(name = "d")
	public Object[][] readExcelSheet() throws IOException {
		f = new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\XL2.xlsx"));
		book = new XSSFWorkbook(f);
		sheet = book.getSheetAt(2);
		sheet.getRow(1).getCell(1);
												//int i = sheet.getLastRowNum(); // how may row in the sheet
												//System.out.println(i); 
		o = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; // this array will have all the value of sheet
		
		for (int i = 1; i <sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);  // cell carry all values 
															 System.out.println(cell);
				switch (cell.getCellType()) {
				case XSSFCell.CELL_TYPE_NUMERIC:{
					o [i-1] [j]  = cell.getNumericCellValue();
				} case XSSFCell.CELL_TYPE_STRING:{
				//	System.out.println(cell.getStringCellValue());
					o [i-1] [j]  =cell.getStringCellValue();
				} case XSSFCell.CELL_TYPE_FORMULA:{
					o [i-1] [j]  =cell.getCachedFormulaResultType();
				} case XSSFCell.CELL_TYPE_ERROR:{
					o [i-1] [j]  =cell.getErrorCellValue();
				} case XSSFCell.CELL_TYPE_BOOLEAN:{
					o [i-1] [j]  =cell.getBooleanCellValue();
				}
				}
			}
		}
		return o;
		
	}
	
	
	
	transient int a =30;
	int p;
	@Test
	public void f () {
		System.out.println(p=20);
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
}
