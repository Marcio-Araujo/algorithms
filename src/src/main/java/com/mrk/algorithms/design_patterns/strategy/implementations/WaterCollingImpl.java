package com.mrk.algorithms.design_patterns.strategy;

import com.mrk.algorithms.design_patterns.strategy.interfaces.CoolingBehaviour;

public class WaterCollingImpl implements CoolingBehaviour {

    @Override
    public String executeCooling() {
        return  "Cooling engine with pressurized water";
    }
}
