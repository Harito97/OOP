package com.expression;

public class TestExpressions {
    public TestExpressions() {
    }

    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
        //Dinh nghia cac gia tri
        Evaluable one = new Operand(1);
        Evaluable two = new Operand(2);
        Evaluable three = new Operand(3);
        Evaluable four = new Operand(4);

        //Dinh nghia cac toan tu
        Operator plus = new AdditionOperator();
        Operator minus = new SubtractionOperator();
        Operator multi = new MultiplicationOperator();

        //Thuc hien bieu thuc tinh toan
        Evaluable result = new Expression(one, two, plus);
        result.evaluate();
        result = new Expression(result, three, multi);
        result.evaluate();
        result = new Expression(result, four, minus);
        result.evaluate();

        //In ra ket qua
        System.out.println("Result is: " + result.evaluate());

    }
}
