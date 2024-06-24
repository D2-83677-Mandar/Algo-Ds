package question4;

//4. Write program to implement linear queue in which front and rear starts at 0.

public class Program {

	public static void main(String[] args) {
		
		Queue dq = new Queue(5);
		dq.push(10);
		dq.push(20);
		dq.push(30);
		dq.push(40);
		dq.push(50);
		dq.display();
		System.out.println(dq.peek());
		System.out.println(dq.pop());
		System.out.println(dq.peek());
	}

}
