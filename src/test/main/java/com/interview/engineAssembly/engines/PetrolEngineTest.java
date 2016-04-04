package com.interview.engineAssembly.engines;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetrolEngineTest {
    @Test
    public void getType() {
        IEngine engine = new PetrolEngine();
        assertEquals(EngineType.INTERNAL_COMBUSTION, engine.getType());
    }

    @Test
    public void getFuelType() {
        IEngine engine = new PetrolEngine();
        assertEquals(FuelType.PETROL, engine.getFuelType());
    }

    @Test
    public void getBatchSize() {
        IEngine engine = new PetrolEngine();
        assertEquals(8, engine.getBatchSize());
    }

    @Test
    public void getBatchCost() {
        IEngine engine = new PetrolEngine();
        assertEquals(9.00, engine.getBatchCost(), 0.01);
    }

}