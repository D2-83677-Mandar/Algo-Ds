package com.sunbeam;

import java.util.Arrays;

public class Question03 {
	
	
	 public static int linearSearch(int[] arr, int key) {
	        int comparisons = 0;

	        for (int i = 0; i < arr.length; i++) {
	            comparisons++;
	            if (arr[i] == key) {
	                return comparisons; 
	            }
	        }

	        return comparisons; 
	    }
	 
	 public static int binarySearch(int[] arr, int key) {
	        int comparisons = 0;

	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            comparisons++; 

	            int mid = (low + high) / 2;
	            if (arr[mid] == key) {
	                return comparisons;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return comparisons; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int key = 5;

	        int linear = linearSearch(arr, key);
	        System.out.println("Linear Search Comparisons: " + linear);
	        
	        Arrays.sort(arr); 

	        int binary = binarySearch(arr, key);
	        System.out.println("Binary Search Comparisons: " + binary);
	    }

}
