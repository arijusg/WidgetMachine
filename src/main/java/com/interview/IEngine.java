package main.java.com.interview;

public interface IEngine {
    EngineType GetType();
    FuelType GetFuelType();
    int GetBatchSize();
    double GetBatchCost();
}

