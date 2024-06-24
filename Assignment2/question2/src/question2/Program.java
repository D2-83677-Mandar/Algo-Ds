package question2;

import java.util.Arrays;

//2. Modify the insertion sort algorithm to sort the array in descending order

public class Program {

	public static void insertionSort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println("Before Sort : " + Arrays.toString((arr)));
		insertionSort(arr);
		System.out.println("After Sort : " + Arrays.toString((arr)));

	}
}
