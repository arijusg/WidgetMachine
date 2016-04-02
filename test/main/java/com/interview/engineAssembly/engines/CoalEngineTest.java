package main.java.com.interview.engineAssembly.engines;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoalEngineTest {
    @Test
    public void getType() {
        IEngine engine = new CoalEngine();
        assertEquals(EngineType.STEAM, engine.getType());
    }

    @Test
    public void getFuelType() {
        IEngine engine = new CoalEngine();
        assertEquals(FuelType.COAL, engine.getFuelType());
    }

    @Test
    public void getBatchSize() {
        IEngine engine = new CoalEngine();
        assertEquals(2, engine.getBatchSize());
    }

    @Test
    public void getBatchCost() {
        IEngine engine = new CoalEngine();
        assertEquals(5.65, engine.getBatchCost(), 0.01);
    }

}