package main.java.com.interview.engineAssembly.engines;


public class WoodEngine implements IEngine {

    public EngineType getType() {
        return EngineType.STEAM;
    }

    public FuelType getFuelType() {
        return FuelType.WOOD;
    }

    public int getBatchSize() {
        return 2;
    }

    public double getBatchCost() {
        return 4.35;
    }
}
