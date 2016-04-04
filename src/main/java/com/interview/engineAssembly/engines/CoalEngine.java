package com.interview.engineAssembly.engines;


public class CoalEngine implements IEngine {

    public EngineType getType() {
        return EngineType.STEAM;
    }

    public FuelType getFuelType() {
        return FuelType.COAL;
    }

    public int getBatchSize() {
        return 2;
    }

    public double getBatchCost() {
        return 5.65;
    }
}
