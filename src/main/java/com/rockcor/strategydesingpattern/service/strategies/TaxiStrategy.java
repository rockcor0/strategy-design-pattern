package com.rockcor.strategydesingpattern.service.strategies;

import com.rockcor.strategydesingpattern.model.Route;
import com.rockcor.strategydesingpattern.service.Strategy;

public class TaxiStrategy  implements Strategy {

    @Override
    public Route buildRoute() {
        Route r = new Route();
        r.setDuration("\u231B");
        r.setPrice("\u0024 \u0024 \u0024 \u0024 \u0024");

        return r;
    }
}
