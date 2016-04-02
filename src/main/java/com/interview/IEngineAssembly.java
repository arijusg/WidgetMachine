package main.java.com.interview;

public interface IEngineAssembly {
    IEngine getEngine();
    int getFuelLevel();
    void fillTank(FuelType fuelType, int quantity);
    void start();
    void stop();
}
