package solution;

import org.testng.annotations.Test;

class outSide{
	
	int i = 30;
	
	class inside{ //nested_classes 
		
		int j = 40;
	}
	
}


public class nested_classes {
	@Test
	public void test() {
		
//		outSide o = new outSide();
//		System.out.println(o.i);
//		
//		outSide.inside i = o.new inside();
//		System.out.println(i.j);
//		
//		System.out.println(outSide2.i);
//		outSide2.inside a = new outSide2.inside();
//		System.out.println(outSide2.inside.j);
//		System.out.println(a.k);
		
		int x = 'a';
		System.out.println(x);
		
		
		
		
		
		
		String s ="you tube premium";
		
		String [] s1 = s.split("u");
		for (String s2 : s1) {
			System.out.println(s2);
		}
		
		
		
		
	}
}

class outSide2{

	static int i = 50;
	
	static class inside{ //nested_classes 
		
		static int j = 60;
		int k = 70;
	}
	
}