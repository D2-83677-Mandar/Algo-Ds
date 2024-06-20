package com.sunbeam;

public class Question01 {
	
	//Time Complexity: O(n)
	//Space Complexity: O(1)
	public static boolean isPalindrome1(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
	
	//Time Complexity: O(n)
	//Space Complexity: O(n)
	public static boolean isPalindrome2(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

	public static void main(String[] args) {
		String s = "madam";
        System.out.println(isPalindrome1(s));
        
        System.out.println(isPalindrome2(s));

	}

}
