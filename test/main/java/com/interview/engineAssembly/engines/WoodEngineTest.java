package main.java.com.interview.engineAssembly.engines;

import main.java.com.interview.engineAssembly.engines.EngineType;
import main.java.com.interview.engineAssembly.engines.FuelType;
import main.java.com.interview.engineAssembly.engines.PetrolEngine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodEngineTest {
    @Test
    public void getType() {
        IEngine engine = new WoodEngine();
        assertEquals(EngineType.Steam, engine.getType());
    }

    @Test
    public void getFuelType() {
        IEngine engine = new WoodEngine();
        assertEquals(FuelType.WOOD, engine.getFuelType());
    }

    @Test
    public void getBatchSize() {
        IEngine engine = new WoodEngine();
        assertEquals(2, engine.getBatchSize());
    }

    @Test
    public void getBatchCost() {
        IEngine engine = new WoodEngine();
        assertEquals(4.35, engine.getBatchCost(), 0.01);
    }
}