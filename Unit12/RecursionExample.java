// This program demonstrates an infinite loop by calling the printer method repeatedly, resulting in a stack overflow
public class RecursionExample {

	public static void main(String[] args) {
		
		printer();

	}
	
	public static void printer() {
		
		System.out.println("hello");
		
		printer();
	}

}
