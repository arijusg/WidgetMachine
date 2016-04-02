package main.java.com.interview;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetrolEngineTest {
    @Test
    public void getType() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(EngineType.InternalCombustion, pe.getType());
    }

    @Test
    public void getFuelType() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(FuelType.PETROL, pe.getFuelType());
    }

    @Test
    public void getBatchSize() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(8, pe.getBatchSize());
    }

    @Test
    public void getBatchCost() {
        PetrolEngine pe = new PetrolEngine();
        assertEquals(9.00, pe.getBatchCost(), 0.01);
    }

}