package question3;

import java.util.Arrays;

//3. Write a function to sort employees by their salary.

public class program {
	
	public static void insertionSort(Employee arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			Employee key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j].getSalary() < key.getSalary()) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] empArr = new Employee[6];
		
		empArr[0] = new Employee(101, "Ram", 50000.00);
		empArr[1] = new Employee(102, "Sham", 60000.00);
		empArr[2] = new Employee(103, "Radha", 45000.00);
		empArr[3] = new Employee(104, "Sachin", 50700.00);
		empArr[4] = new Employee(105, "Rohit", 90000.00);
		empArr[5] = new Employee(106, "Hardik", 25000.00);
		
		System.out.println("Before Sort : " + Arrays.toString(empArr));
		insertionSort(empArr);
		System.out.println("After Sort : " + Arrays.toString(empArr));

	}

}
