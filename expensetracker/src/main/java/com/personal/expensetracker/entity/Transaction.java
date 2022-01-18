package com.personal.expensetracker.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
@Getter
public class Transaction {
    @Id
    @Column(name = "pk_transIdx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    @Column(name = "debit")
    private int debitAmt;
    @Column(name = "credit")
    private int creditAmt;
    @Column(name = "balance_amt")
    private int balanceAmt;
    @Column(name = "payment_channel_id", nullable = false)
    private int paymentChannelId;

    @ManyToOne
    @JoinColumn(name = "fk_acountId", referencedColumnName = "pk_accountIdx", nullable = false)
    private int accountId;
}
