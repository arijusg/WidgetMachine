package com.interview;

import com.interview.engineAssembly.EngineAssembly;
import com.interview.engineAssembly.IEngineAssembly;
import com.interview.engineAssembly.engines.PetrolEngine;

public class WidgetMachine {

    //Default contructor was left with same behaviour due to unclear spec.
    public WidgetMachine() {
        _engineAssembly = new EngineAssembly(new PetrolEngine());
    }

    public WidgetMachine(IEngineAssembly engineAssembly) {
        _engineAssembly = engineAssembly;
    }

    private IEngineAssembly _engineAssembly;

    public double produceWidgets(int quantity) {
        _engineAssembly.fillTank(_engineAssembly.getEngine().getFuelType(), 100);
        _engineAssembly.start();
        double cost = 0;
        if (!_engineAssembly.getIsRunning()) return cost;
        cost = produce(quantity);
        _engineAssembly.stop();
        return cost;
    }

    private double produce(int quantity) {
        double costPerBatch = _engineAssembly.getEngine().getBatchCost();

        int batch = 0;
        int batchCount = 0;
        int batchSize = _engineAssembly.getEngine().getBatchSize();
        while (batch < quantity) {
            batch = batch + batchSize;
            batchCount++;
        }

        return batchCount * costPerBatch;
    }


}
