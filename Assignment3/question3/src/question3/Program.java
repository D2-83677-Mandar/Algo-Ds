package question3;

//3. Display Singly linear linked list in reverse order.

public class Program {

	public static void main(String[] args) {
		
		SLL ll = new SLL();
		ll.addFirst(40);
		ll.addFirst(30);
		ll.addFirst(20);
		ll.addFirst(10);
		ll.display();
		ll.DisplayReverse();

	}

}
