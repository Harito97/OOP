package com.patterns.strategy.strategies_and_singletons;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
