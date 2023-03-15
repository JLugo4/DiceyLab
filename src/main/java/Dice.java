import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dice {
    private int die1 = 0; //Declaring die1
    private int die2 = 0;//Declaring die2

    Random rand = new Random();

    static ArrayList<Integer> diceArray = new ArrayList<>();
    public Dice(){
    }
    public int roll(){
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        int result = die1 + die2;
        diceArray.add(result);
        return result;
    }
    public int roll(int numberOfDie) {
        int result = 0;
        for(int i =0; i < numberOfDie; i++){
            result += rand.nextInt(6) + 1;

        }
        diceArray.add(result);
        return result;
    }
}
