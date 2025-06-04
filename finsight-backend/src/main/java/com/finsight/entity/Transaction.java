package com.finsight.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String referenceId;           // e.g. IPS74894515436089469
    private String toAccount;                 // e.g. NEO EMPIRE PTE. LTD.
    private Double amount;                // e.g. 7.60
    private String source;                // e.g. "Gmail-PayLah"
    private LocalDateTime transactionTime; // Date & time of transaction (parsed from email)
    private String fromAccount;           // Optional: e.g. PayLah Wallet (ending 4235)
    private String rawMessageId;          // Gmail message ID (for deduplication)
    private LocalDateTime createdAt = LocalDateTime.now(); // When we added it to the DB

    // --- Constructors ---

    public Transaction() {}

    public Transaction(String referenceId, String toAccount, Double amount, String source,
                       LocalDateTime transactionTime, String fromAccount, String rawMessageId) {
        this.referenceId = referenceId;
        this.toAccount = toAccount;
        this.amount = amount;
        this.source = source;
        this.transactionTime = transactionTime;
        this.fromAccount = fromAccount;
        this.rawMessageId = rawMessageId;
        this.createdAt = LocalDateTime.now();
    }

    // --- Getters & Setters ---

    public Long getId() { return id; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public String getToAccount() { return toAccount; }
    public void setToAccount(String title) { this.toAccount = title; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public LocalDateTime getTransactionTime() { return transactionTime; }
    public void setTransactionTime(LocalDateTime transactionTime) { this.transactionTime = transactionTime; }

    public String getFromAccount() { return fromAccount; }
    public void setFromAccount(String fromAccount) { this.fromAccount = fromAccount; }

    public String getRawMessageId() { return rawMessageId; }
    public void setRawMessageId(String rawMessageId) { this.rawMessageId = rawMessageId; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
