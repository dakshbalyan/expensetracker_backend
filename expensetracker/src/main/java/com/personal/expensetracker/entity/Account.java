package com.personal.expensetracker.entity;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "account")
@Getter
@ToString
public class Account {
    @Id
    @Column(name = "pk_accountIdx")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment basic
    private int accountId;

    @Column(name = "balance_amt", nullable = false)
    private int balanceAmt;
    @Column(name = "created_at", nullable = false)
    private LocalDate accountCreatedAt;
    @Column(name = "last_modified_at", nullable = false)
    private LocalDateTime accountLastModified;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_userId", referencedColumnName = "user_idx")
    private User user;

    @ToString.Exclude
    @OneToMany(mappedBy = "accountId")
    private List<Expense> expenseList;
    @ToString.Exclude
    @OneToMany(mappedBy = "payerAccountId")
    private List<Dues> duesList;

    @ToString.Exclude
    @OneToMany(mappedBy = "")
    private List<Transaction> transactionList;
}
