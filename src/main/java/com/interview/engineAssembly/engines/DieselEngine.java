package main.java.com.interview.engineAssembly.engines;


public class DieselEngine implements IEngine {

    public EngineType getType() {
        return EngineType.INTERNAL_COMBUSTION;
    }

    public FuelType getFuelType() {
        return FuelType.DIESEL;
    }

    public int getBatchSize() {
        return 8;
    }

    public double getBatchCost() {
        return 12.00;
    }
}
