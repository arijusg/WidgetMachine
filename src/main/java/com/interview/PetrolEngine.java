package main.java.com.interview;


public class PetrolEngine implements IEngine {

    public EngineType GetType() {
        return EngineType.InternalCombustion;
    }

    public FuelType GetFuelType() {
        return FuelType.PETROL;
    }

    public int GetBatchSize() {
        return 8;
    }

    public double GetBatchCost() {
        return 9.00;
    }
}
