package question7;

import java.util.Arrays;

//7. Create an array of integers. Reverse the array using stack

public class Program {
	
	public static void main(String[] args) {
		
		Stack st = new Stack(5);
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before Reverse : ");
        for(int ele : arr) {
        	st.push(ele);
        	System.out.print(ele + " ");
        }
        
        int i = 0;
        System.out.println("\nAfter Reverse : ");
        while(!st.isEmpty()) {
        	arr[i++] = st.pop();
        }
        
        System.out.println(Arrays.toString(arr));

	}

}
