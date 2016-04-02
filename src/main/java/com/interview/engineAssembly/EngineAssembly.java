package main.java.com.interview.engineAssembly;

import main.java.com.interview.engineAssembly.engines.FuelType;
import main.java.com.interview.engineAssembly.engines.IEngine;

public class EngineAssembly implements IEngineAssembly {

    public EngineAssembly(IEngine engine) {
        _engine = engine;
        _fuelLevel = 0;
        _isRunning = false;
    }

    private IEngine _engine;
    private int _fuelLevel;
    private boolean _isRunning;

    public IEngine getEngine() {
        return _engine;
    }

    public int getFuelLevel() {
        return _fuelLevel;
    }

    public void fillTank(FuelType fuelType, int quantity) {
        if (fuelType != _engine.getFuelType()) throw new WrongFuelException();
        if (quantity < 0) throw new QuantityOutOfRangeFuelException();
        if ((_fuelLevel + quantity) > 100) throw new QuantityOutOfRangeFuelException();
        _fuelLevel += quantity;
    }

    public boolean getIsRunning() {
        return _isRunning;
    }

    public void start() {
        if (_fuelLevel <= 0) return;
        _isRunning = true;
    }

    public void stop() {
        _isRunning = false;
    }
}
