package com.patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    //Attribute
    private SquarePeg peg;

    //Constructor
    public SquarePegAdapter(SquarePeg peg){
        super(peg.getWidth() * Math.sqrt(2) / 2);
        this.peg = peg;
    }

    //Getter
//    public double getRadius(){
//        return super.getRadius();
//    }
}
