import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
public class Dice {
    private int numberOfDice;
    private Random random;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.random = new Random();
    }
    public int diceRollResult () {
        int resultOfRoll = 0;
        for (int i = 0; i < numberOfDice; i++) {
           resultOfRoll += random.nextInt(5) + 1;
        }
        return resultOfRoll;
        }
    //the diceRollResult
    }

