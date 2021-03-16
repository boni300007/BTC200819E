package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XLSheetRead {

	FileInputStream f;
	XSSFWorkbook book;
	XSSFSheet sheet;
	
	//@Test
	public void test1() throws IOException {
		
		f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
		book = new XSSFWorkbook(f);
		sheet = book.getSheetAt(1);
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		double d = sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);
		System.out.println(d);
	}
	
	//@Test
	public void test2() throws Exception {
		
		f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
		book = new XSSFWorkbook(f);
		sheet = book.getSheetAt(0);
		int data = sheet.getLastRowNum();
		System.out.println(data);

		for (int i=0; i<data; i++) {
			String data1 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data1);
		}
		
	}
	
	//@Test
		public void test3() throws Exception {
			f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
			book = new XSSFWorkbook(f);
			sheet = book.getSheetAt(1);
			int data = sheet.getLastRowNum();
			System.out.println(data);
			for (int i=0; i<data; i++) {
				int data1 = (int) sheet.getRow(i).getCell(1).getNumericCellValue();
				System.out.println(data1);
			}	
		}
				//@Test
				public void test4() throws Exception {
					f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
					book = new XSSFWorkbook(f);
					sheet = book.getSheetAt(0);
					for (int i = 1; i < sheet.getLastRowNum(); i++) {
						for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++) {
						XSSFCell  cell= sheet.getRow(i).getCell(j);
						switch(cell.getCellType()) {
						case XSSFCell.CELL_TYPE_NUMERIC: {
							System.out.println(cell.getNumericCellValue());
						}
						}
					}
					}
				}
				Object [][] o;
				
				
				//@Test
				public void test5() throws Exception {
					f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
					book = new XSSFWorkbook(f);
					sheet = book.getSheetAt(1);
					sheet.getRow(0).getCell(0);
					 o = new Object[sheet.getLastRowNum()] [sheet.getRow(0).getLastCellNum()];
					for (int i = 1; i < sheet.getLastRowNum(); i++) {
						for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++) {
						XSSFCell  cell= sheet.getRow(i).getCell(j);
						switch(cell.getCellType()) {
						case XSSFCell.CELL_TYPE_NUMERIC: {
							//System.out.println(cell.getNumericCellValue());
							o[i-1][j]=cell.getNumericCellValue();
							System.out.println(o[i-1][j]);
							System.out.println("Array work");
						}
						}
					}
					}
				}
				
				@Test(dataProvider = "d")
				public void test7(Object o, Object o1) {
					System.out.println(o);
					System.out.println(o1);
				}
				
				@DataProvider(name = "d")
				public Object[][] test6() throws Exception {
					f= new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
					book = new XSSFWorkbook(f);
					sheet = book.getSheetAt(1);
					sheet.getRow(0).getCell(0);
					 o = new Object[sheet.getLastRowNum()] [sheet.getRow(0).getLastCellNum()];
					for (int i = 1; i < sheet.getLastRowNum(); i++) {
						for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++) {
						XSSFCell  cell= sheet.getRow(i).getCell(j);
						switch(cell.getCellType()) {
						case XSSFCell.CELL_TYPE_NUMERIC: {
							//System.out.println(cell.getNumericCellValue());
							o[i-1][j]=cell.getNumericCellValue();
							System.out.println(o[i-1][j]);
							System.out.println("Array work");
						}
						}
					}
					}
					return o;
				}
	
}
