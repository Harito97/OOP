package com.patterns.strategy.ex_strategy;

import com.patterns.strategy.Strategy;

public class Car implements Vehicle {
    private Vehicle car;
    public Car(){}
    public void setCar(Vehicle car){
        this.car = car;
    }
    public void whatCanDo(){
        car.whatCanDo();
    }
}
