package com.sunbeam;

public class Question05 {
	
	 public static int binarySearchDescending(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == key) {
	                return mid; 
	            } else if (arr[mid] < key) {
	                high = mid - 1; 
	            } else {
	                low = mid + 1; 
	            }
	        }

	        return -1; 
	    }

	public static void main(String[] args) {
		
		int[] arr = {10, 8, 6, 4, 2, 0, -2, -4, -6, -8};
        int key = 8;

        int index = binarySearchDescending(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }

	}

}
