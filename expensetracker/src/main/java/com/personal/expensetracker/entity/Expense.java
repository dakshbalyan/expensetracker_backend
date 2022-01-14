package com.personal.expensetracker.entity;

import java.time.LocalDateTime;

public class Expense {
    private int expenseAmt;
    private int expenseCategory;
    private String expenseLocation;
    private LocalDateTime expenseDateTime;
    private int expensePaymentMode;
    private String expenseRemarks;
    private int accountId;
}
