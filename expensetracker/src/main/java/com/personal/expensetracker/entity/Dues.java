package com.personal.expensetracker.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dues")
@Getter
public class Dues {
    @Id
    @Column(name = "pk_dueIdx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dueId;
    @Column(name = "payeeId", nullable = false)
    private int payeeAccountId;
    @Column(name = "payment_channel_id", nullable = false)
    private int payerPaymentChannel;
    @Column(name = "amount_owed", nullable = false)
    private int amountOwed;
    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;
    @Column(name = "repayment_date", nullable = false)
    private LocalDate settlementDate;

    @ManyToOne
    @JoinColumn(name = "fk_payerAccountId", referencedColumnName = "pk_accountIdx", nullable = false)
    private Account payerAccountId;
}
