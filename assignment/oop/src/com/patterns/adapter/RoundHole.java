package com.patterns.adapter;

public class RoundHole {
    //Attribute
    private double radius;

    //Constructor
    public RoundHole(double radius){
        this.radius = radius;
    }

    //Getter
    public double getRadius() {
        return radius;
    }

    //APIs
    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
