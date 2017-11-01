package string;

import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		String st = shrink("abbbcccgggcbdsaa",3);
		System.out.println(" Final String : "+st);
		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);
	
	}
	
   public static String shrink(String str, int k){
	   char [] ch = str.toCharArray();
	   int flag=0,index,n,count=1;
	   String temp;
	   	   
	   for (int i=0;i<str.length();i++){
		   index = k+i-1;
		   flag=index;
		   n=i;
		   count=1;
		   if (index>=str.length()){
			   index=str.length()-1;
		   }	   		   
		   while(index>i){
			   if(ch[index]==ch[index-1])
			   {
				      count++;
			   }			  
			   if(index==i+1 && count==k){
				  temp= deDupe(str,n,flag,k);
				  str=temp;				 
				  ch = str.toCharArray();
			   } 
			   index--;
		   }
	   }
	   return str;
   }
   
   public static String deDupe(String str, int i,int j,int k){
	   
	   String ss= str.substring(0, i) + str.substring(j+1, str.length());
	 
	   String sf = shrink(ss,k);
	
	   return sf;
   }
}
