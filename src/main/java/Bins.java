
public class Bins {
    private int[] loggedResults;
    private int minResult;
    private int maxResult;

    public Bins(int minResult, int maxResult){
        this.minResult = minResult;
        this.maxResult = maxResult;
        loggedResults = new int[maxResult-minResult+1];
    }

    public void addingResults(int result){
        loggedResults[result - minResult] += 1;

    }
    public int returningResults(int numberRolled){
       return loggedResults[numberRolled - minResult];
    }
}












//I need to store the results of the dice rolled to an array. the way i can update is maybe a switch case.
// the array should be able to be changed for the amount of dice are being rolled...
//like results Array (number of dice).... 1 dice = 6... 2 dice = 12... 3 dice = 18 etc...
//maybe something like Array[numberOfDice] results = new Array
// number of dice(){
//