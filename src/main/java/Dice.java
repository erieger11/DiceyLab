import java.util.Random;
public class Dice {
    static int numberOfDice;
    public int diceRollResult (){

        return (int) ((Math.random() * 6) + 1) * numberOfDice;
    }




    //I creat two dice that are randomized to roll a certain amount 1-6.
    // I need to change it where the amount of dice can be changed
    //Then i add up the total for all the dice rolled. that should become the result.
}
