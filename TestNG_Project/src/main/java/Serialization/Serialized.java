package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;

public class Serialized {
	
	@Test
	public void test() throws IOException, ClassNotFoundException {
		dog d = new dog();
		FileOutputStream fos = new FileOutputStream("abc.anything");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("abc.anything");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog d1 = (dog)ois.readObject();
		
		System.out.println(d1.s + "......."+d1.a);
	}

}
