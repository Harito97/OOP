package com.patterns.singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM ab");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K66A5");

        System.out.println("is foo = bar: ");
        System.out.print(foo == bar);
    }
}
