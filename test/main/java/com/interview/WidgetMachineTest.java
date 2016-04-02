package main.java.com.interview;

import mockit.*;
import org.junit.*;

import static org.junit.Assert.*;


public class WidgetMachineTest {

    @Mocked
    InternalCombustionEngine engine;

    @Test
    public void ProduceWidgetsUsingPetrolEngine() {
        new Expectations() {{
            engine.isRunning(); result = true;
            engine.getFuelType(); result = FuelType.PETROL;
        }};

        WidgetMachine wm = new WidgetMachine();
        int cost = wm.produceWidgets(10);

        new VerificationsInOrder() {{
            engine.start(); times = 1;
            engine.isRunning();
            engine.stop(); times = 1;
        }};

        assertEquals(18, cost);
    }

    @Test
    public void ProduceWidgetsUsingDieselEngine() {
        new Expectations() {{
            engine.isRunning(); result = true;
            engine.getFuelType(); result = FuelType.DIESEL;
        }};

        WidgetMachine wm = new WidgetMachine();
        int cost = wm.produceWidgets(10);

        new VerificationsInOrder() {{
            engine.start(); times = 1;
            engine.isRunning();
            engine.stop(); times = 1;
        }};

        assertEquals(24, cost);
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