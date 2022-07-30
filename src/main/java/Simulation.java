public class Simulation {
    Dice RollDie;
    Integer numOfRolls;
    Bins result;

    public Simulation(Integer numberOfDie, Integer numberOfRolls) {
        RollDie = new Dice(numberOfDie);
        numOfRolls = numberOfRolls;
        result = new Bins(numberOfDie * 6);
    }
    public void runSimulation(){
        for (int i = 0; i < numOfRolls; i++) {
            int singleRoll = RollDie.rollDie();
            result.incrementBin(singleRoll);
        }
    }


}
