package com.mrk.algorithms.design_patterns.strategy;

import com.mrk.algorithms.design_patterns.strategy.interfaces.PoweringBehaviour;

public class EletricPoweringImpl implements PoweringBehaviour
{
    @Override
    public String executePoweringBehaviour() {
        return "220V/50A power source from engine";
    }
}
