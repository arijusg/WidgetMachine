package main.java.com.interview;

public class EngineAssembly implements IEngineAssembly {

    public EngineAssembly(IEngine engine) {
        _engine = engine;
        _fuelLevel = 0;
    }

    private IEngine _engine;
    private int _fuelLevel;

    public IEngine getEngine() {
        return _engine;
    }

    public int getFuelLevel() {
        return _fuelLevel;
    }

    public void fillTank(FuelType fuelType, int quantity) {
        if (fuelType != _engine.GetFuelType()) throw new WrongFuelException();
        if (quantity < 0) throw new QuantityOutOfRangeFuelException();
        if((_fuelLevel + quantity) > 100) throw new QuantityOutOfRangeFuelException();
        _fuelLevel += quantity;
    }

    public void start() {

    }

    public void stop() {

    }
}
