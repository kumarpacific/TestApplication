package programs;




import static java.util.Arrays.asList;

import java.util.List;

import  javaPrograms.DrawObjectShape;


public class Derived {
	public static void main(String[] args) {
		List<String> ls = asList("abc","cde");//asList("hello","world");
		
		ls.add("efg");
		
		Derived d = new Derived();
		String name ="";
		//name = d.name;
		System.out.println(name);
	}
	
	public static void show(){
		System.out.println("SUCCESS : SUCCESS");
		
	}
	static {
		
		System.out.println("this will print first");
	}
	
}