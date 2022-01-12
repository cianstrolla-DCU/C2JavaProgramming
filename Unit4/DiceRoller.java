// This program find the 

public class DiceRoller {
    

    //main 
    public static void main(String[] args) {
        
        //choose random number between one and six

        double averageThrees = 0;

        for (int i = 0; i < 100; i++) {
            int toAverage = rollDice();
            averageThrees += toAverage;
        }

        System.out.println(averageThrees / 100);
        
    }

    public static int rollDice() {
        int counter = 0;
        int counterLimit = 60000;
        int numberOfThrees = 0;

        while(true) {

            if (counter == counterLimit) {
                return numberOfThrees;
            }
            
            int roll = (int) (Math.random() * 6) + 1;

            if (roll == 3) {
                numberOfThrees++;
            }
            counter++;

        }
    }
}
