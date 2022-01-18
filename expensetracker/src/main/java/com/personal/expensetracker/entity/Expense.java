package com.personal.expensetracker.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
@Getter
public class Expense {
    @Id
    @Column(name = "pk_expenseIdx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expenseIndex;

    @Column(name = "amount", nullable = false)
    private int expenseAmt;

    @Column(name = "category", nullable = false)
    private int expenseCategory;

    @Column(name = "location", nullable = false)
    private String expenseLocation;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime expenseDateTime;

    @Column(name = "payment_channel_id", nullable = false)
    private int expensePaymentMode;

    @Column(name = "remarks")
    private String expenseRemarks;

    @ManyToOne
    @JoinColumn(name = "fk_accountId", referencedColumnName = "pk_accountIdx", nullable = false)
    private Account accountId;
}
