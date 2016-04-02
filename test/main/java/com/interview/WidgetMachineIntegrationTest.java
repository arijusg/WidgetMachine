package main.java.com.interview;


import org.junit.*;

import static org.junit.Assert.*;

public class WidgetMachineIntegrationTest {

    @Test
    public void produceWidgetsWithPetrolEngine() {
        IEngine engine = new PetrolEngine();
        IEngineAssembly assembly = new EngineAssembly(engine);
        WidgetMachine machine = new WidgetMachine(assembly);
        double cost = machine.produceWidgets(10);
        assertEquals(18.00, cost, 0.01);
    }

    @Test
    public void produceWidgetsWithDieselEngine() {
        IEngine engine = new DieselEngine();
        IEngineAssembly assembly = new EngineAssembly(engine);
        WidgetMachine machine = new WidgetMachine(assembly);
        double cost = machine.produceWidgets(10);
        assertEquals(24.00, cost, 0.01);
    }

    @Test
    public void produceWidgetsWithWoodEngine() {
        IEngine engine = new WoodEngine();
        IEngineAssembly assembly = new EngineAssembly(engine);
        WidgetMachine machine = new WidgetMachine(assembly);
        double cost = machine.produceWidgets(10);
        assertEquals(21.75, cost, 0.01);
    }

    @Test
    public void produceWidgetsWithCoalEngine() {
        IEngine engine = new CoalEngine();
        IEngineAssembly assembly = new EngineAssembly(engine);
        WidgetMachine machine = new WidgetMachine(assembly);
        double cost = machine.produceWidgets(10);
        assertEquals(28.25, cost, 0.01);
    }
}
