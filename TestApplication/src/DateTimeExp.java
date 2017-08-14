import java.time.*;
import java.util.Calendar;
import java.util.Date;
public class DateTimeExp {

	public static void main(String[] args) {
	 int total = 0;
	StringBuilder letters = new StringBuilder("abcdefg");
	 total += letters.substring(1, 2).length();
	 total += letters.substring(6, 6).length();
	total += letters.substring(6, 7).length();
	 System.out.println( "Total : " +total+ "  : " + letters);
		 
		 String a = "";
	 a += 2;
	 a += 'c';
	 a += false;
	 if ( a == "2cfalse") System.out.println("==");
	 if ( a.equals("2cfalse")) System.out.println("equals");
	
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.of(ld,lt);
		System.out.println(ldt);
		
		Calendar c = Calendar.getInstance();
		c.set(2015,Calendar.JANUARY,20);	
		System.out.println(c.getTimeZone());
	
 StringBuilder sb1 = new StringBuilder();
  sb1.  append("aaa").  insert(1, "bb").  insert(4, "ccc");
  
  System.out.println(sb1);
  
  String s = "Java";
  StringBuilder sb = new StringBuilder("java");
  if(s.equals(sb)){
	  System.out.println("equals");
  }

 
  String str = "purr";
  str.toUpperCase();
 str.trim();
 
   str.substring(1, 3);

   str += " two";
   System.out.println("  Length ::"+str.length());
 
 
 String numbers = "012345678";
 System.out.println(numbers.substring(1, 3));
 System.out.println(numbers.substring(7, 7));
 System.out.println(numbers.substring(7));
 
     s.concat("LL");
	 String roar1 = "roar";
	 StringBuilder roar2 = new StringBuilder("roar");
	 new DateTimeExp().roar(roar1, roar2);
	
	 System.out.println(roar1 + " " + roar2);
	 } 
		
			
public void roar(String roar1, StringBuilder roar2) {
	 roar1.concat("!!!");
	 roar2.append("!!!");
	 }
}
