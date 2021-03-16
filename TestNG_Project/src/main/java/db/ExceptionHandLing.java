package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionHandLing {
	// compile time exception - it could be happen or not
	// run time exception -  
	
	
	FileReader f; // this will help to read the file
	BufferedReader bf;
	
	@Test
	public void readText() throws IOException {
	try {
		// Risk code
		
		f = new FileReader(new File("C:\\Users\\alami\\eclipse-workspace\\TestNG_Project\\book.txt"));
		bf = new BufferedReader(f);
		String line = bf.readLine();
		while (line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
			
	} catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("file not read");
		
	} finally {
		if (f!=null) 
		f.close();
		System.out.println("finaly");
	} if (bf!=null) {
		bf.close();
		System.out.println("finaly2");
		
	}
	System.out.println("finaly3");
	
//	catch(IOException i) {
//		i.printStackTrace();
//		System.out.println("book does not read");
//	}

}

}




















