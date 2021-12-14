package com.github.ismail2ov.wrapmethod;

import java.util.Date;

public interface PaymentService {
    void pay(Employee employee, Date date, Money amount);
}
