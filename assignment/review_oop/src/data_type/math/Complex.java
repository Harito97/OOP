package data_type.math;

public class Complex {
    //22h22 - 15/11/2022
    //Attributes
    private double real = 0.0;
    private double imag = 0.0;

    //Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
    }

    //Get, Set
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    //APIs
    @Override
    public String toString() {
        return "MyComplex[" +
                this.real + " + " +
                this.imag + "i" +
                ']';
    }

    public boolean isReal(){
        return this.imag == 0;
    }

    public boolean isImaginary(){
        return this.real == 0;
    }

    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(Complex another){
        if (another == null) return false;
        return (this.real == another.real
            && this.imag == another.imag);
    }

    public double magnitude(){
        return Math.sqrt(this.real * this.real +
                this.imag * this.imag);
    }

    public double argument(){
        return Math.atan2(this.imag, this.real);
    }

    public Complex addInto(Complex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public Complex add(Complex right){
        Complex newComplex = new Complex();
        newComplex.real = this.real + right.real;
        newComplex.imag = this.imag + right.imag;
        return newComplex;
    }

    public Complex subtractInto(Complex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public Complex subtract(Complex right){
        Complex newComplex = new Complex();
        newComplex.real = this.real - right.real;
        newComplex.imag = this.imag - right.imag;
        return newComplex;
    }

    public Complex multiply(Complex right){
        Complex newComplex = new Complex();
        newComplex.real = this.real * right.real
                - this.imag * right.imag;
        newComplex.imag = this.real * right.imag
                + this.imag * right.real;
        return newComplex;
    }

    public Complex divide(Complex right){
        Complex newComplex = this.multiply(right);
        double denominator = right.real * right.real
                + right.imag * right.imag;
        newComplex.real /= denominator;
        newComplex.imag /= denominator;
        return newComplex;
    }

    public Complex conjugate(){
        Complex newComplex = new Complex();
        newComplex.real = this.real;
        newComplex.imag = - this.imag;
        return newComplex;
    }
}
