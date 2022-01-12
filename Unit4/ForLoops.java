/*
 * This program demonstrates a for loop. We first create a String testString and then define our loop. We intitial counter to be equal to 0,
 * we specify the condition as counter less than the length of the testString, we then say increase the counter by 1 after each iteration. 
 * The loop then prints out each character of testString.
 */


public class ForLoops {

	public static void main(String[] args) {
		
		String testString = "The Quick Brown Fox Jumps Over The Lazy Dog";
		
		System.out.println(testString.length()); // 43
		
		for (int counter = 0; counter < testString.length(); counter++) {
			
			System.out.println("Next character: " + testString.charAt(counter));
		
		}
		
	}

}
