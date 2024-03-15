public class Simulation {
    private int numberOfDice;
    private int numberOfRolls;
    private Bins resultsArray;
    public Simulation(int numberOfDice, int numberOfRolls, int minResult, int maxResult){
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        this.resultsArray = new Bins(minResult, maxResult);
    }
    public void runTheSimulation(){
        Dice dice = new Dice(numberOfDice);
        for (int i = 0; i < numberOfRolls; i++) {
           resultsArray.addingResults(dice.diceRollResult());
        }
    }

    public String result(){
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        builder.append("Simulation of ").append(numberOfRolls).append(" tosses with ").append(numberOfDice).append(" dice.\n");
        builder.append("\n\n");

        for (int i = numberOfDice; i <= 6 * numberOfDice; i++) {
            builder.append(String.format("%2d : %8d: %.2f ", i, resultsArray.returningResults(i), (double) resultsArray.returningResults(i) / numberOfRolls));
            for (int j = 0; j < (double) resultsArray.returningResults(i) / numberOfRolls * 100; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void main(String args[]){
        Simulation simulation = new Simulation(2, 1000000,2,12);
        simulation.runTheSimulation();
        System.out.println(simulation.result());
    }

}
