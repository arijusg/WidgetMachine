package main.java.com.interview.engineAssembly.engines;


public class PetrolEngine implements IEngine {

    public EngineType getType() {
        return EngineType.INTERNAL_COMBUSTION;
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
