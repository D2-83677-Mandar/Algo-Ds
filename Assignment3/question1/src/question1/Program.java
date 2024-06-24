package question1;

//1. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
//all operations.

public class Program {

	public static void main(String[] args) {
		
		SCLL ll = new SCLL();
		ll.addLast(30);
		ll.addLast(20);
		ll.addLast(10);
		ll.addFirst(40);
		ll.deleteFirst();
		ll.deleteLast();

		ll.display();
		
	}

}
