package main.java.com.interview;

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
    public void fillTankWithRightFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, 100);
        assertEquals(100, ee.getFuelLevel());
    }

    @Test(expected=WrongFuelException.class)
    public void fillTankWithWrongFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.DIESEL, 100);
    }

    @Test(expected=QuantityOutOfRangeFuelException.class)
    public void OverfillWithFuel() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, 200);
    }
    @Test(expected=QuantityOutOfRangeFuelException.class)
    public void LessThanZeroQuantityOfFuelToBeFilled() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly ee = new EngineAssembly(engine);
        ee.fillTank(FuelType.PETROL, -30);
    }

    @Test
    public void start() throws Exception {

    }

    @Test
    public void stop() throws Exception {

    }

}