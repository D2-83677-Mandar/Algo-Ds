package question5;

public class Program {
	
	public static void main(String[] args) {
		
		Stack st = new Stack(5);
		st.push(10);
		st.push(20);
		System.out.println(st.pop());
		st.push(30);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
