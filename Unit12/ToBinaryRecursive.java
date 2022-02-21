public class ToBinaryRecursive {

	public static void main(String[] args) {
		
		System.out.println(toBinary(4568));

	}

	public static String toBinary(int n) {
		
		if (n <= 1) {
			return String.valueOf(n);
		}
		return toBinary(n / 2) + String.valueOf(n % 2);
	}
	
}
