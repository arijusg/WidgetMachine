package main.java.com.interview.engineAssembly.engines;


public class WoodEngine implements IEngine {

    public EngineType getType() {
        return EngineType.InternalCombustion;
    }

    public FuelType getFuelType() {
        return FuelType.PETROL;
    }

    public int getBatchSize() {
        return 8;
    }

    public double getBatchCost() {
        return 9.00;
    }
}
