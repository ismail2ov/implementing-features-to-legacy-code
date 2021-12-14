package com.github.ismail2ov.wrapclass;

public class Money {
    private double amount;

    public Money() {
        this.amount = 0;
    }

    public void add(double amount) {
        this.amount += amount;
    }
}
