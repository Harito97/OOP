package trapezoidalrule;

public class TrapezoidalRule {
    public static void main (String[] args) {
        System.out.println("Trapezoidal Rule: " + integrate());
        System.out.println("Java Library: " + Math.pow(Math.sin(Math.PI/2),3) / 3);
    }

    public static double f(double x) {
        return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }

    public static double integrate(int n) {
        double a = 0;
        double b = Math.PI / 2;
        double x = a;
        double result = f(x) / 2;
        double h = (b - a) / n;
        for (int i = 1; i < n; i++){
            x += h;
            result += f(x);
        }
        x += h;
        result += f(x) / 2;
        return result * h;
    }

    public static double integrate() {
        int n0 = 2;
        double l2n = integrate(2 * n0);
        double ln = integrate(n0);
        while (Math.abs(l2n - ln) >= 0.0000001){
            n0 *= 2;
            l2n = integrate(2 * n0);
            ln = integrate(n0);
        }
        System.out.println("Xap xi den n = " + n0);
        return ln;
    }
}