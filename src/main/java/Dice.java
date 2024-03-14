import java.util.Random;



public class Dice {
    int dice1 = (int) (Math.random() * 6) + 1;
    int dice2 = (int) (Math.random() * 6) + 1;

    public int totalDiceRoll(){
        return dice1 + dice2;
    }
}
