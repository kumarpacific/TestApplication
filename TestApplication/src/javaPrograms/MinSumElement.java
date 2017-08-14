package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinSumElement {
	static int sum = 0;
	static public Stack<Integer> st = new Stack<>();
	static public List ls= new ArrayList();

	public static void main(String[] args) {
		int[] arr = { 3, 2, 0, 2, 0, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				sum += (2 << (arr[i] - 1));
			else
				sum++;
		}
		System.out.println(sum);
		minPower(sum, 2);
		System.out.println("Solution " + ls);	

	}

	static void minPower(int n, int x) {
		int t = 0, i = 1, y = 0,index=0;
		
		
		if(n>1){
		
			while (n > y) {
				y = x << i;
				t = i++;
			}
		

		int temp = x << (t - 1);
		 index = t;

		minPower(n - temp, 2);
		st.push(index);
		ls.add(index);

		
		}
	
	if (n == 1) {
			st.push(index);
			ls.add(index);
	}	
	
	
	}
}