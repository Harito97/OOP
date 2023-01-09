package com.fraction;

import java.util.*;

public class TestFraction {
    private List<Fraction> fractions;

    public TestFraction() {
    }

    public Fraction getSecondLargesValue() {
        List<Fraction> sorted = sortByValue(fractions);
        return sorted.size() > 1 ? sorted.get(sorted.size() - 2) : null;
    }

    public static void main(String[] args) {
        TestFraction testFraction = new TestFraction();
        testFraction.fractions = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            testFraction.fractions.add(new Fraction(random.nextInt(1000) + 1, random.nextInt(1000) + 1));
        }
        print(testFraction.fractions);
        print(sortByValue(testFraction.fractions));
        print(sortByDenominator(testFraction.fractions));
        System.out.println(testFraction.getSecondLargesValue());
    }

    public static void print(List<Fraction> fractions) {
        for (Fraction fraction : fractions) {
            System.out.print(fraction + " ");
        }
        System.out.println();
    }

    public static List<Fraction> sortByDenominator(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
//        Collections.sort(result, (fraction1, fraction2) -> Integer.compare(fraction1.getDenominator(), fraction2.getDenominator()));
        result.sort(Comparator.comparingInt(Fraction::getDenominator));
        return result;
    }

    public static List<Fraction> sortByValue(List<Fraction> fractions) {
        List<Fraction> result = new ArrayList<>(fractions);
        Collections.sort(result);
        return result;
    }
}
