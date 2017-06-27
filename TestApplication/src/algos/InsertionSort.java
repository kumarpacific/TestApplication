package algos;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 45, 12, 36, 94, 20, 11, 85, 24 };
		int temp, small, j;

		for (int i = 1; i < arr.length; i++) {
			small = arr[i];
			j = i - 1;
			while (j >= 0 && small < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
			for (int k = 0; k < arr.length; k++) {
				System.out.print("  "+arr[k] );
			}
			System.out.println();

		}
	
	}

}
