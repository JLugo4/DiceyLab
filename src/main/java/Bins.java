import java.util.ArrayList;
import java.util.HashMap;
public class Bins {
    int min;
    int max;
    ArrayList<Integer> bins = new ArrayList<>();
    public Bins(){
        min = 2;
        max = 12;
        for(Integer s : Dice.diceArray) {
            if( s >= 2 && s <= 12){
                bins.add(s);
            }
        }
    }
    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        for(Integer s : Dice.diceArray) {
            if( s >= min && s <= max){
                bins.add(s);
            }
        }
    }
    public Integer getBin() {
        int counter= 0;
        for( Integer s : bins){
            counter++;
        }
        return counter;
    }
    public Integer getBin(int num) {
        int counter= 0;
        for( Integer s: bins){
            if(s == num) {
                counter++;
            }
        }
        return counter;
    }
}
