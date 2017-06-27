package algos;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10];
		int minVal, minIndex, t;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) {
			minVal = arr[i];
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < minVal) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			if (minVal < arr[i]) {
				t = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = t;
			}
			for (int k = 0; k < arr.length; k++) {
				System.out.print(" " + arr[k]);
			}
			System.out.println();
		}

	}

}
