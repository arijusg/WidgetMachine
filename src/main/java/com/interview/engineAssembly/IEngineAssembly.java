package com.interview.engineAssembly;

import com.interview.engineAssembly.engines.FuelType;
import com.interview.engineAssembly.engines.IEngine;

public interface IEngineAssembly {
    IEngine getEngine();
    int getFuelLevel();
    boolean getIsRunning();
    void fillTank(FuelType fuelType, int quantity);
    void start();
    void stop();
}
