package main.java.com.interview.engineAssembly;

import main.java.com.interview.engineAssembly.engines.FuelType;
import main.java.com.interview.engineAssembly.engines.IEngine;

public interface IEngineAssembly {
    IEngine getEngine();
    int getFuelLevel();
    boolean getIsRunning();
    void fillTank(FuelType fuelType, int quantity);
    void start();
    void stop();
}
