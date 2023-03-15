import java.sql.SQLOutput;

public class Simulation {
int numDice, numToss;

public Simulation(int numDice, int numToss){
    this.numDice = numDice;
    this.numToss = numToss;
}
public void runSimulation(){
    Dice dice = new Dice();
    for (int i = 0; i < numToss; i++) {
        dice.roll(numDice);
    }
}
public void printResults(){
    Bins bins = new Bins();
    System.out.println("***\nSimulation of" + numDice + "dice tossed for " + numToss + "times\n***");
    System.out.println();

    for (int i = (1 * numDice); i <= (6*numDice); i++) {
        System.out.printf("%2s",i);
        System.out.print(" :");
        System.out.printf("%9s",bins.getBin(i));
        System.out.print(": ");
        System.out.printf("%.2f", (double) bins.getBin(i)/bins.getBin());
        System.out.print(" ");
        for (int j = 0; j < (double) bins.getBin(i)/bins.getBin() * 100; j++) {
            System.out.print("*");

        }
        System.out.println();
    }
}
public static void main(String[] args){
    Simulation sim = new Simulation(2, 100000);
    sim.runSimulation();
    sim.printResults();
}
}
