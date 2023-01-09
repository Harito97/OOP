package com.patterns.strategy;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String c = in.next();
        int b = in.nextInt();

        switch (c){
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubtract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.execute(a, b);
        System.out.print("= " + result);
    }
}
