package com.sunbeam;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find the rank");
		int num = sc.nextInt();
		int count = 0;
		sc.close();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=num) {
				count++;
			}
		}
		
		System.out.println("The rank of "+num +" is "+count);
		
	}

}
