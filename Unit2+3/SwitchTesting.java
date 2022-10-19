// example of a switch statement

public class SwitchTesting {

	public static void main(String[] args) {
		
		int season = 7;
		
		switch (season) {
			
			case 1: System.out.println("Spring");
				break;
			case 2: System.out.println("Summer");
				break;
			case 3: System.out.println("Autumn");
				break;
			case 4: System.out.println("Winter");
				break;
			default: System.out.println("Invalid season");
				break;
		}

	}

}
