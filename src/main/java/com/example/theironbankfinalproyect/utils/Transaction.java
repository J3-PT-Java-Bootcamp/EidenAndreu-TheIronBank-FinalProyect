package com.example.theironbankfinalproyect.utils;

import com.example.theironbankfinalproyect.model.users.User;
import com.example.theironbankfinalproyect.utils.Money;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public String type;
    private Money amount;
    private long fromAccount;
    private long toAccount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Transaction(String type, Money amount, long fromAccount, long toAccount, User user) {
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.user = user;
    }

    public static Transaction transfer(Money amount, long fromAccount, long toAccount, User user) {
        return new Transaction("TRANSFER", amount, fromAccount, toAccount, user);
    }
}
