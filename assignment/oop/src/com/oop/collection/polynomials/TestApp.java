package com.oop.collection.polynomials;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});
        Poly testSpecialCase = new ListPoly(new double[]{-1, 0, -5, 1, 0, -4});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);
        System.out.println("testSpecialCase = " + testSpecialCase);

        if (ap.equals(lp) && lp.equals(ap)){
            System.out.println("ap == lp");
        } else {
            System.out.println("ap != lp");
        }

        ap = ap.derivative();
        System.out.println("ap' = "  + ap.toString());

        lp = lp.derivative();
        System.out.println("lp' = " + lp.toString());
    }
}
