public class MyMath {
    //Constructor
    public MyMath() {
    }

    //APIs
    public double cos(double x){
        double result = 1.0;
        double temp = 1;
        for (int i = 2; i < 10000; i++){
            if (i % 4 == 2){
                temp *= x * x / ((i - 1) * i);
                result -= temp;
            } else if (i % 4 == 4){
                temp *= x * x / ((i - 1) * i);
                result -= temp;
            }
        }
        return result;
    }

    //Su dung thuat toan Euclid
    public String decimalTo(String number, int outRadix){
        int num = Integer.parseInt(number);
        if (num < 0 || outRadix < 2 || outRadix > 16 ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = num;

        while (remainder > 0) {
            if (outRadix > 10) {
                m = remainder % outRadix;
                if (m >= 10) {
                    sb.append((char) (55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % outRadix);
            }
            remainder = remainder / outRadix;
        }
        return sb.reverse().toString();
    }

    public double exp(double x){
        double result = 1.0;
        double temp = 1.0;
        for (int i = 1; i < 10000; i++){
            temp *= x / i;
            result += temp;
        }
        return result;
    }

    //Su dung pp Horner
    public String toDecimal(String number, int inRadix){
        return "";
    }

    public String toRadix(String number, int inRadix, int outRadix){
        return "";
    }

    //Main
    public static void main(String[] args) {
        MyMath test = new MyMath();
        double result = test.exp(2.2) * test.cos(3.3);
        result = Math.exp(2.2) * Math.cos(3.3);
        System.out.printf("%s%.4f", "e^2.2 * cos(3.3) = ", result);
        System.out.println();
        System.out.println("Kiem tra bang ham thu vien Java:");
        result = Math.exp(2.2) * Math.cos(3.3);
        System.out.printf("%s%.4f", "e^2.2 * cos(3.3) = ", result);


    }




}
