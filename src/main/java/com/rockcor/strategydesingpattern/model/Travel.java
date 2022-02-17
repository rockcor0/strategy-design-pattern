package com.rockcor.strategydesingpattern.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Travel {

    private String duration;
    private String price;

    @Override
    public String toString() {
        return "duration >> " + duration + "\n" +
                "price    >> " + price + "\n";
    }
}
