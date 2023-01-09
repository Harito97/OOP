package com.oop.collection.polynomials;

public class ArrayPoly extends AbstractPoly{
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree(){
        for (int i = coefficients.length - 1; i >= 0; i--){
            if (coefficients[i] != 0){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Poly derivative(){
        double[] DerivativeCoefficients = new double[coefficients.length - 1];
        for (int i = 0; i < DerivativeCoefficients.length; i++){
            DerivativeCoefficients[i] = coefficients[i + 1] * (i + 1);
        }
        return new ArrayPoly(DerivativeCoefficients);
//        return new ArrayPoly(this.derive());
    }

    @Override
    public double coefficient(int degree){
        if (degree < 0 || degree > coefficients.length - 1){
            return (double) coefficients[degree];
        }
        return 0;
    }

    @Override
    public double[] coefficients(){
        return coefficients;
    }
}
