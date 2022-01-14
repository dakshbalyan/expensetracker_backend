package com.personal.expensetracker.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Account {
    private int balanceAmt;
    private LocalDate accountCreatedAt;
    private LocalDateTime accountLastModified;
    private int userId;
    private List<Expense> expenseList;
    private List<Dues> duesList;
    private List<Transaction> transactionList;
}
