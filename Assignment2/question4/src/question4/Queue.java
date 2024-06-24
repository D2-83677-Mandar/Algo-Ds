package question4;

public class Queue {

	private int arr[];
	private int front, rear;
	private final int size;

	public Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = rear = 0;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Queue is full!....");
		} else {
			arr[rear] = value;
			rear++;
		}
	}

	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty!....");
			return -1;
		}
		else {
			int temp = arr[front];
			front++;
			return temp;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is full!....");
			return -1;
		} else {
			return arr[front];
		}
	}

	public boolean isFull() {
		return rear == size;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	 public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty!...");
	        } else {
	            System.out.print("Queue elements: ");
	            for (int i = front; i < rear; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            System.out.println();
	        }
	    }
}


