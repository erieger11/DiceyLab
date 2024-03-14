import java.util.Random;



public class Dice {
    int dice1 = (int) (Math.random() * 6) + 1;
    int dice2 = (int) (Math.random() * 6) + 1;

    public int totalDiceRoll(){
        return dice1 + dice2;
    }



    //I creat two dice that are randomized to roll a certain amount 1-6.
    // I need to change it where the amount of dice can be changed
    //Then i add up the total for all the dice rolled. that should become the result.
}
