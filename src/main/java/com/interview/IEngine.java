package main.java.com.interview;

public interface IEngine {
    EngineType GetType();
    FuelType GetFuelType();
    boolean IsRunning();
    int GetFuelLevel();
    int GetBatchSize();
    double GetBatchCost();
}

