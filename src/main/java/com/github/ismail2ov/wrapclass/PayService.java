package com.github.ismail2ov.wrapclass;

import java.util.Date;

public final class PayService {
    private static PayService instance;

    private PayService() {
    }

    public static PayService getInstance() {
        if (instance == null) {
            instance = new PayService();
        }
        return instance;
    }

    public boolean payPeriodContains(Date date) {
        return false;
    }

    public double getPayRate() {
        return 1.25;
    }
}
