package javaPrograms;

import java.util.*;
import java.time.*;


class Base {
	
	    public  void show() {
	       System.out.println("Base::show() called");
	    }
	}
	  
	class Derived extends Base {
	 int a;
		public  void show() {
	       System.out.println("Derived::show() called"+a);
	    }
	}
	  
	class KillBill {
		
	    public static void main(String[] args) {
	    	
	    	
	    	
	    	String a= "helloman";
	    	String br = "abcdef";
	    	String brn = " abcdef".trim();	    			
	    	System.out.println(" equals "+ (brn.equals(br)));
	    	System.out.println(" equals "+ (brn==br));
	    	List <Integer> ls= new ArrayList<>();
	    	ls.add(5);
	    	ls.add(9);
	    	ls.add(8);
	    	System.out.println("List values  :"+ls);
	    	ls.remove(2);
	    	System.out.println("List values  :"+ls);
	    	int lstring=ls.get(1);
	    	System.out.println("String value  :"+lstring);
	    	ls.add(null);
	    	int nullstring = ls.get(2);
	    	System.out.println("String value  :"+nullstring);    
	
	int arr[] = {3,2,1};
	System.out.println(" arr : "+Arrays.binarySearch(arr, 3)); //Binary search on no sorted
	
	int arr2[] = {1,2,3};
	System.out.println(" arr : "+Arrays.binarySearch(arr2, 3));
	        Base b = new Derived();;
	        b.show();
	        int x = 6;
	        boolean y = (x >= 6) || (++x <= 7);
	        System.out.println(x);  
	       
	        int[][] arra = new int[4][5];
	        for (int [] arra1 : arra){
	        	for (int arra2: arra1){
	        		
	        	}
	        }
	    }
	   
	}