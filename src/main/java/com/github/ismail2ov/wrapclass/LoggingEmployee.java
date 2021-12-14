package com.github.ismail2ov.wrapclass;

public class LoggingEmployee {
    private final Employee employee;

    public LoggingEmployee(Employee employee) {
        this.employee = employee;
    }

    public void pay() {
        logPayment();
        employee.pay();
    }

    private void logPayment() {
//        this.logger.log(this);
    }
}
