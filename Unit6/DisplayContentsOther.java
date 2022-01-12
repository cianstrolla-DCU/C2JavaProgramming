
public class DisplayContentsOther {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		String displayString = "|";
		for (int i = 0; i < nums.length; i++)
		{
		   if (i > 0)	// don’t put separator before first element
		   {
		     displayString += " // ";
		   }
		   displayString += nums[i];
		}
		displayString += "|";
		System.out.println("nums = " + displayString);
 
	}

}
