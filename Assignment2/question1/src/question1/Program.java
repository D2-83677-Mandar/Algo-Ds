package question1;

//1. Write a insertion sort function to sort array and returns no of comparisions.

import java.util.Arrays;

public class Program {
	
	public static int insertionSort(int arr[]) {
		
		int cnt = 0;
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				cnt++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return cnt;
	}

	public static void main(String[] args) {
		
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Before Sort : " + Arrays.toString((arr)));
        int comp = insertionSort(arr);
        System.out.println("After Sort : " + Arrays.toString((arr)));
        System.out.println("No of Comparison : " + comp);
        
	}

}
