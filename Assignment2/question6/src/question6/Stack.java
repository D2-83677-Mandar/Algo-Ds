package question6;

public class Stack {

	private int arr[];
	private int top;
	private final int size;
	private int max;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = size;
		max = 0;
	}
	
	public int getMax() {
		return max;
	}

	public void push(int value) {
		if (isFull()) {
			return;
		}
		if(value > max) max = value;
		arr[--top] = value;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
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
