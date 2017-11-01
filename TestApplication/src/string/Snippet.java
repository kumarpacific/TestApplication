package string;

public class Snippet {
	
	public static void main(String args[]){
		final long startTime = System.nanoTime();
		String sh = shrink("abbcccbdeh",3);
			System.out.println(" Final String : "+sh);
			final long duration = System.nanoTime() - startTime;
			System.out.println(duration);
	}	
	
	public static String shrink(String str, int k){
		int n = k-1;
		 int l = 0;
		    do {
		        l = str.length();
		        str = str.replaceAll("(.)\\1{" + n + "}", "");
		    } while (l != str.length());

		return str;
	}
}

