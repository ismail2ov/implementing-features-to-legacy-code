package com.github.ismail2ov.wrapmethod;

import com.github.ismail2ov.sproutmethod.ArticlesManager;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
public final class Employee {
    List<TimeCard> timeCards = new ArrayList<>();
    private final Date date;

    public void pay() {
        PayService payService = PayService.getInstance();
        PayDispatcher payDispatcher = PayDispatcher.getInstance();
        Money amount = new Money();
        for (TimeCard timeCard : timeCards) {
            if (payService.payPeriodContains(date)) {
                amount.add(timeCard.getHours() * payService.getPayRate());
            }
        }
        payDispatcher.pay(this, date, amount);
    }

    public void makeLoggedPayment() {
        logPayment();
        pay();
    }

    private void logPayment() {
//        this.logger.log(this);
    }
}
