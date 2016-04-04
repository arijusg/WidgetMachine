package com.interview.engineAssembly.engines;

public interface IEngine {
    EngineType getType();
    FuelType getFuelType();
    int getBatchSize();
    double getBatchCost();
}

