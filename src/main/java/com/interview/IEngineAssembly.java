package main.java.com.interview;

public interface IEngineAssembly {
    IEngine getEngine();
    int getFuelLevel();
    boolean getIsRunning();
    void fillTank(FuelType fuelType, int quantity);
    void start();
    void stop();
}
