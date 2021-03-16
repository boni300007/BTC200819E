package db;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readExcelSheet {
	
	FileInputStream f; 
	XSSFWorkbook book;
	XSSFSheet sheet;
	Object [][] o;
	@Test(dataProvider = "d")
	public void test5(Object o, Object o1) {
		System.out.println(o);
		System.out.println(o1);	
	}
	
	@DataProvider(name = "d")
	public Object[][] readXL() throws Throwable {
	try {
		f = new FileInputStream(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\DataProvider.xlsx"));
		book = new XSSFWorkbook(f);
		sheet = book.getSheetAt(0);
		sheet.getRow(2).getCell(1);
		 o = new Object[sheet.getLastRowNum()] [sheet.getRow(0).getLastCellNum()];
		
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j <sheet.getRow(0).getLastCellNum(); j++) {
			XSSFCell  cell= sheet.getRow(i).getCell(j);
			switch(cell.getCellType()) {
			case XSSFCell.CELL_TYPE_NUMERIC: {
				//System.out.println(cell.getNumericCellValue());
				o[i-1][j]=cell.getNumericCellValue();
			} case XSSFCell.CELL_TYPE_STRING:{
				//System.out.println(cell.getStringCellValue());
				o[i-1][j] = cell.getStringCellValue();
			} case XSSFCell.CELL_TYPE_BOOLEAN:{
				System.out.println(cell.getBooleanCellValue());
			}
			}		
			}
		}
	} 
	catch (IOException e) {
		System.out.println("failur"); 
		
	} finally {
		
	 if (f!=null) {
		f.close();
	 }
	}
	System.out.println("finaly3");
	
//	catch(IOException i) {
//		i.printStackTrace();
//		System.out.println("book does not read");
//	}
	return o;
}


}
