package main.java.com.interview;

public interface IEngine {
    EngineType getType();
    FuelType getFuelType();
    int getBatchSize();
    double getBatchCost();
}

