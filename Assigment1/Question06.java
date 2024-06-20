package com.sunbeam;

public class Question06 {
	
	public static int linearSearch(int[] arr, int target, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
        int target = 2;
        int n = 3;
        int index = linearSearch(arr, target, n);

        if (index != -1) {
            System.out.println("The " + n + "th occurrence of TARGET is at index " + index);
        } else {
            System.out.println("The " + n + "th occurrence of TARGET is not found");
        }

	}

}
