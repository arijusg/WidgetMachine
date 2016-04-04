package com.interview.engineAssembly;

import com.interview.engineAssembly.engines.FuelType;
import com.interview.engineAssembly.engines.IEngine;
import com.interview.engineAssembly.engines.PetrolEngine;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineAssemblyTest {
    @Test
    public void getEngine() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        assertEquals(engine, ee.getEngine());
    }

    @Test
    public void newEngineAssemblyContainsZeroFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        assertEquals(0, ee.getFuelLevel());
    }
    @Test
    public void newEngineAssemblyIsNotRunning() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        assertFalse(ee.getIsRunning());
    }

    @Test
    public void fillTankWithRightFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, 100);
        assertEquals(100, ee.getFuelLevel());
    }

    @Test(expected = WrongFuelException.class)
    public void fillTankWithWrongFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.DIESEL, 100);
    }

    @Test(expected = QuantityOutOfRangeFuelException.class)
    public void overfillWithFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, 200);
    }

    @Test(expected = QuantityOutOfRangeFuelException.class)
    public void lessThanZeroQuantityOfFuelToBeFilled() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, -30);
    }

    @Test
    public void startEngineWithFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(engine.getFuelType(), 100);
        ee.start();
        assertTrue(ee.getIsRunning());
    }

    @Test
    public void startEngineWithNoFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.start();
        assertFalse(ee.getIsRunning());
    }

    @Test
    public void stopEngine() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(engine.getFuelType(), 100);
        ee.start();
        ee.stop();
        assertFalse(ee.getIsRunning());
    }

}