package com.personal.expensetracker.enums;

public enum Category {
    FOOD(1), SOCIAL(2);
    private final int id;

    private Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
