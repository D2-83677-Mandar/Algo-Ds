package question6;


public class Program {

	public static void main(String[] args) {
		
		Stack st = new Stack(5);
		st.push(10);
		st.push(80);
		st.push(30);
		st.pop();
		st.push(20);		
		System.out.println("Max ele : " + st.getMax());
	}

}
