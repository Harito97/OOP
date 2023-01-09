package com.patterns.adapter;

public class ClientUse {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("is hole fits to roundPeg: " + hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        //System.out.println("is hole fits to roundPeg: " + hole.fits(smallSquarePeg));
        //bao loi vi 2 doi tuong k lien quan nen k so sanh duoc

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println("is hole fits to smallSquarePegAdapter: " + hole.fits(smallSquarePegAdapter));
        System.out.println("is hole fits to largeSquarePegAdapter: " + hole.fits(largeSquarePegAdapter));
    }
}
