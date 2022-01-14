package com.personal.expensetracker.enums;

public enum PaymentChannel {
    CARD(1), CASH(2);
    private final int id;

    private PaymentChannel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
