package com.rockcor.strategydesingpattern.service.strategies;

import com.rockcor.strategydesingpattern.model.Travel;
import com.rockcor.strategydesingpattern.service.Strategy;

public class WalkStrategy implements Strategy {

    @Override
    public void execute() {
        Travel r = new Travel();
        r.setDuration("\u231B \u231B \u231B \u231B \u231B");
        r.setPrice("\u0024");

        System.out.println(r.toString());
    }
}
