package com.sunbeam;

public class Question02 {

	public static int lastOccurrence(int[] arr, int key) {
        int lastIndex = -1; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i; 
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
        int key = 2;

        int lastIndex = lastOccurrence(arr, key);

        if (lastIndex != -1) {
            System.out.println("Last occurrence is at index: " + lastIndex);
        } else {
            System.out.println(" not found ");
        }
    }

}
