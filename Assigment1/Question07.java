package com.sunbeam;

public class Question07 {
	
	 public static int findFirstNonRepeating(int[] arr) {
	        int minVal = Integer.MAX_VALUE;
	        int maxVal = Integer.MIN_VALUE;
	        
	        for (int num : arr) {
	            if (num < minVal) minVal = num;
	            if (num > maxVal) maxVal = num;
	        }
	        
	        int range = maxVal - minVal + 1;
	        int[] count = new int[range];
	        boolean[] repeated = new boolean[range];
	        
	        for (int num : arr) {
	            count[num - minVal]++;
	        }
	        
	        for (int num : arr) {
	        	//&& !repeated[num - minVal]
	            if (count[num - minVal] == 1 ) {
	                return num;
	            }
//	            repeated[num - minVal] = true; 
	        }	        	        
	        return Integer.MIN_VALUE; 
	    
	 }

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, -1, 2, 1, 0, 4, -1, 7, 8 };
        int result = findFirstNonRepeating(arr);
        
        System.out.println("First non-repeating element: " + result);

	}

}
