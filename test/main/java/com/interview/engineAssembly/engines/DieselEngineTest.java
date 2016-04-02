package main.java.com.interview.engineAssembly.engines;

import main.java.com.interview.engineAssembly.engines.EngineType;
import main.java.com.interview.engineAssembly.engines.FuelType;
import main.java.com.interview.engineAssembly.engines.PetrolEngine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselEngineTest {
    @Test
    public void getType() {
        IEngine engine = new DieselEngine();
        assertEquals(EngineType.InternalCombustion, engine.getType());
    }

    @Test
    public void getFuelType() {
        IEngine engine = new DieselEngine();
        assertEquals(FuelType.DIESEL, engine.getFuelType());
    }

    @Test
    public void getBatchSize() {
        IEngine engine = new DieselEngine();
        assertEquals(8, engine.getBatchSize());
    }

    @Test
    public void getBatchCost() {
        IEngine engine = new DieselEngine();
        assertEquals(12.00, engine.getBatchCost(), 0.01);
    }

}