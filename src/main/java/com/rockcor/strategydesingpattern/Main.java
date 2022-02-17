package com.rockcor.strategydesingpattern;

import com.rockcor.strategydesingpattern.service.Context;
import com.rockcor.strategydesingpattern.service.Strategy;
import com.rockcor.strategydesingpattern.service.strategies.BusStrategy;
import com.rockcor.strategydesingpattern.service.strategies.TaxiStrategy;
import com.rockcor.strategydesingpattern.service.strategies.WalkStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        System.out.println("Strategies");

        Main m = new Main();
        Context context = new Context();

        //Strategy for go walking
        m.goWalking(context);

        //Strategy for go in bus
        m.takeABus(context);

        //Strategy for go in taxy
        m.takeATaxi(context);

    }

    public void goWalking(Context context){
        Strategy goWalking = new WalkStrategy();
        context.setStrategy(goWalking);
        System.out.println("Go Walking");
        context.execute();
    }

    public void takeABus(Context context){
        Strategy takeABus = new BusStrategy();
        context.setStrategy(takeABus);
        System.out.println("Take a bus");
        context.execute();
    }

    public void takeATaxi(Context context){
        Strategy takeATaxi = new TaxiStrategy();
        context.setStrategy(takeATaxi);
        System.out.println("Take a taxi");
        context.execute();
    }

}
