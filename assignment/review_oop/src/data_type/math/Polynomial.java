package data_type.math;

public class Polynomial {
    //Attributes
    private double[] coeffs;

    //Constructor
    public Polynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    //APIs
    public int getDegree(){
        if (this == null){
            return -1;
        }
        for (int i = coeffs.length - 1; i >= 0; i--){
            if (coeffs[i] != 0){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        int degree = this.getDegree();
        String result = "";
        if (coeffs[degree] == 0){
        } else if (coeffs[degree] == -1){
            result += "- " + "x^" + degree;
        } else if (coeffs[degree] == 1){
            result += "x^" + degree;
        } else if (coeffs[degree] < 0){
            result += " - " + Math.abs(coeffs[degree]) + "x^" + degree;
        } else {
            result += " + " + coeffs[degree] + "x^" + degree;
        }
        for (int i = degree - 1; i > 0; i--){
            if (coeffs[i] == 0){
                continue;
            }
            if (coeffs[i] == -1){
                result += " - x^" + i;
                continue;
            }
            if (coeffs[i] == 1){
                result += " + x^" + i;
                continue;
            }
            if (coeffs[i] < 0){
                result += " - " + Math.abs(coeffs[i]) + "x^" + i;
            } else {
                result += " + " + coeffs[i] + "x^" + i;
            }
        }
        if (coeffs[0] == 0){
        } else if (coeffs[0] == -1){
            result += " - " + 1;
        } else if (coeffs[0] == 1){
            result += " + " + 1;
        } else if (coeffs[0] < 0){
            result += " - " + Math.abs(coeffs[0]);
        } else {
            result += " + " + coeffs[0];
        }
        return "Polynomial[" + result + ']';
    }

    public double evaluate(double x){
        double result = coeffs[0];
        int degree = this.getDegree();
        double temp = 1.0;
        for (int i = 1; i <= degree; i++){
            result += coeffs[i] * temp * x;
            temp *= x;
        }
        return result;
    }

    public Polynomial add(Polynomial right){
        if (right == null) return null;
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        Polynomial result = new Polynomial(new double[maxDegree + 1]);
        for (int i = 0; i <= maxDegree; i++){
            result.coeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        return result;
    }

    public Polynomial multiply(Polynomial right){
        if (right == null) return null;
        int degreeOfThis = this.getDegree();
        int degreeOfRight = right.getDegree();
        int degreeOfResult = degreeOfThis * degreeOfRight;
        Polynomial result = new Polynomial(new double[degreeOfResult]);
        for (int i = 0; i <= degreeOfThis; i++){
            for (int j = 0; j <= degreeOfRight; j++){
                result.coeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(new double[]{1.2, -4.3, 0.0, -1.0, 0});
        Polynomial p2 = new Polynomial(new double[]{0, -4.3, 0.0, -1.0, 1.0});
        System.out.println("Degree of p1 = " + p1.getDegree());
        System.out.println("Degree of p2 = " + p2.getDegree());
        System.out.println("p1 = " + p1.toString());
        System.out.println("p2 = " + p2.toString());
        System.out.printf("p1(4.3) = %.2f\n", p1.evaluate(4.3));
        System.out.println("p1 + p2 = " + p1.add(p2).toString());
        System.out.println("p1 * p2 = " + p1.multiply(p2).toString());
    }
    //23h18 - 15/11/2022
    //23h40 - 15/11/2022 - viet ham main
}
