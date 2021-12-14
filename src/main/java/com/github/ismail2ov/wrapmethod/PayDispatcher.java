package com.github.ismail2ov.wrapmethod;

import java.util.Date;

public final class PayDispatcher {
    private static PayDispatcher instance;
    private final PaymentService paymentService;

    private PayDispatcher() {
        paymentService = new MptsPaymentService();
    }

    public static PayDispatcher getInstance() {
        if (instance == null) {
            instance = new PayDispatcher();
        }
        return instance;
    }

    public void pay(Employee employee, Date date, Money amount) {
        this.paymentService.pay(employee, date, amount);
    }
}
