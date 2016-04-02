package main.java.com.interview;

import mockit.*;
import org.junit.*;

import static org.junit.Assert.*;


public class WidgetMachineTest {

    @Mocked
    InternalCombustionEngine engine;

    //Different types of engines will be tested in integration tests
    @Test
    public void engine(@Injectable final IEngine engine1,
                       @Injectable final IEngineAssembly engineAssembly) {

        new Expectations() {{
            engine1.getFuelType();
            result = FuelType.PETROL;
            engine1.getBatchSize();
            result = 8;
            engine1.getBatchCost();
            result = 9.00;

            engineAssembly.getEngine();
            result = engine1;
            engineAssembly.getIsRunning();
            result = true;
            times = 1;
        }};

        WidgetMachine wm = new WidgetMachine(engineAssembly);
        double cost = wm.produceWidgets(10);

        assertEquals(18, cost, 0.01);

        new VerificationsInOrder() {{
            engineAssembly.fillTank(FuelType.PETROL, 100);
            times = 1;
            engineAssembly.start();
            times = 1;
            engineAssembly.getIsRunning();
            times = 1;
            engineAssembly.stop();
            times = 1;
        }};
    }

    //Tests:
    //Create widgets using Petrol engine
    //Create widgets using Diesel engine
    //Create widgets using Wood engine
    //Create widgets using Coal engine

    //Create widgets using half a batch
    //Create widgets using full batch
    //Create widgets using one and a half batch

    //To start an engine fuel level needs to be more than zero
    //Engine should be filled with right type of fuel
    //Engine is empty when first reated
    //Engine needs to be started to start production and stopped afterewards


}