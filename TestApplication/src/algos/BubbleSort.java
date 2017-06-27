package algos;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		int t;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
			
		}
		System.out.println("Final sorted array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
