public class Dice {
    private Integer numberOfDiceBeingRolled;
    public Dice(Integer numOfDice) {
        this.numberOfDiceBeingRolled = numOfDice;
    }
    public Integer getNumberOfDiceBeingRolled() {
        return numberOfDiceBeingRolled;
    }
    public Integer rollDie() {
        Integer sum = 0;
        for (int i = 0; i < numberOfDiceBeingRolled; i++) {
            int singleRoll = (int) (Math.random() * 6) + 1;
            sum = sum + singleRoll;
        }
       return sum;
    }
}
