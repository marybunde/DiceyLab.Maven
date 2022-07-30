import org.testng.Assert;
import org.testng.annotations.Test;

public class SimulationTest {
    @Test
    public void SimulationTest() {
        int numberOfDice = 1;
        Simulation simulation = new Simulation(numberOfDice, 2);
        simulation.runSimulation();
        int actual = simulation.result.bin[numberOfDice-1];
        int expected = 0;
        Assert.assertEquals(expected,actual);

    }
}
