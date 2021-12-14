package com.github.ismail2ov.wrapclass;

public class TimeCard {
    private int hours;

    public TimeCard() {
        this.hours = 0;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public int getHours() {
        return this.hours;
    }
}
