package main.java.com.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetrolEngineTest {
    @Test
    public void getType() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(EngineType.InternalCombustion, pe.GetType());
    }

    @Test
    public void getFuelType() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(FuelType.PETROL, pe.GetFuelType());
    }

    @Test
    public void getBatchSize() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(8, pe.GetBatchSize());
    }

    @Test
    public void getBatchCost() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(9.00, pe.GetBatchCost(), 0.01);
    }

}