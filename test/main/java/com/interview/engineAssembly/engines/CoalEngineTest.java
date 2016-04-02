package main.java.com.interview.engineAssembly.engines;

import main.java.com.interview.engineAssembly.engines.EngineType;
import main.java.com.interview.engineAssembly.engines.FuelType;
import main.java.com.interview.engineAssembly.engines.PetrolEngine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoalEngineTest {
    @Test
    public void getType() {
        IEngine engine = new CoalEngine();
        assertEquals(EngineType.Steam, engine.getType());
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
        assertEquals(5.56, engine.getBatchCost(), 0.01);
    }

}