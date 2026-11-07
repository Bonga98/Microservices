package com.banking.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @RequiredArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Id
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "branch_address", nullable = false)
    private String branchAddress;

}
