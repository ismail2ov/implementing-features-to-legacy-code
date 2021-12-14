package com.github.ismail2ov.wrapclass;

import java.util.Date;

public interface PaymentService {
    void pay(Employee employee, Date date, Money amount);
}
