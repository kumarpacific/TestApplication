package string;

import java.lang.reflect.Field;
import java.util.Arrays;

public class MemoryLeakExplain {

	public static void main(String[] args) throws Exception{
		 //Our main String
        String mainString = "i_love_java";
        //Substring holds value 'java'
        String subString = mainString.substring(7);
 
        System.out.println(mainString);
        System.out.println(subString);
 
        //Lets see what's inside mainString
        Field innerCharArray = String.class.getDeclaredField("value");
        innerCharArray.setAccessible(true);
        char[] chars = (char[]) innerCharArray.get(mainString);
        System.out.println(Arrays.toString(chars));
 
        //Now peek inside subString
        chars = (char[]) innerCharArray.get(subString);
        System.out.println(Arrays.toString(chars));
		
	}

}
