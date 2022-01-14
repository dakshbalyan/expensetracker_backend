package com.personal.expensetracker.entity;

import java.time.LocalDate;

public class Dues {
    private int payeeAccountId;
    private int payerAccountId;
    private int payerPaymentChannel;
    private int amountOwed;
    private LocalDate dueDate;
    private LocalDate settlementDate;
}
