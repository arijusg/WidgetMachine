package main.java.com.interview;

import mockit.*;
import org.junit.*;

import static org.junit.Assert.*;


public class WidgetMachineTest {

    //Different types of engines will be tested in integration tests
    @Test
    public void produceHalfBatchUsingPetrolEngine(@Injectable final IEngine engine,
                                                  @Injectable final IEngineAssembly engineAssembly) {

        new Expectations() {{
            engine.getFuelType();
            result = FuelType.PETROL;
            engine.getBatchSize();
            result = 8;
            engine.getBatchCost();
            result = 9.00;

            engineAssembly.getEngine();
            result = engine;
            engineAssembly.getIsRunning();
            result = true;
            times = 1;
        }};

        WidgetMachine wm = new WidgetMachine(engineAssembly);
        double cost = wm.produceWidgets(4);

        assertEquals(9.00, cost, 0.01);

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

    @Test
    public void produceOneBatchUsingPetrolEngine(@Injectable final IEngine engine,
                                                 @Injectable final IEngineAssembly engineAssembly) {

        new Expectations() {{
            engine.getFuelType();
            result = FuelType.PETROL;
            engine.getBatchSize();
            result = 8;
            engine.getBatchCost();
            result = 9.00;

            engineAssembly.getEngine();
            result = engine;
            engineAssembly.getIsRunning();
            result = true;
            times = 1;
        }};

        WidgetMachine wm = new WidgetMachine(engineAssembly);
        double cost = wm.produceWidgets(8);

        assertEquals(9.00, cost, 0.01);

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

    @Test
    public void produceOneAndAHalfBatchesUsingPetrolEngine(@Injectable final IEngine engine,
                                                           @Injectable final IEngineAssembly engineAssembly) {

        new Expectations() {{
            engine.getFuelType();
            result = FuelType.PETROL;
            engine.getBatchSize();
            result = 8;
            engine.getBatchCost();
            result = 9.00;

            engineAssembly.getEngine();
            result = engine;
            engineAssembly.getIsRunning();
            result = true;
            times = 1;
        }};

        WidgetMachine wm = new WidgetMachine(engineAssembly);
        double cost = wm.produceWidgets(12);

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
}