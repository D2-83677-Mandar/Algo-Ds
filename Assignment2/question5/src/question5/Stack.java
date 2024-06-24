package question5;

//5. Write a program to implement descending stack. (Initialize top = SIZE)

public class Stack {
	
	private int arr[];
	private int top;
	private final int size;
	
	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = size;
	}
	
	public void push(int value) {
		if(isFull()) {
			return;
		}
		arr[--top] = value;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return arr[top++];
		}
	}
	
	public boolean isEmpty() {
		return top == size;
	}
	
	public boolean isFull() {
		return top == -1;
	}

}
