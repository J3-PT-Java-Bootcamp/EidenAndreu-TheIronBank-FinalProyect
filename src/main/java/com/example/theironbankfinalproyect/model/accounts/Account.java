package com.example.theironbankfinalproyect.model.accounts;

import com.example.theironbankfinalproyect.model.Money;
import com.example.theironbankfinalproyect.model.users.AccountHolder;
import com.example.theironbankfinalproyect.model.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Account {

    public Account(AccountHolder primaryOwner, AccountHolder secondaryOwner, Money balance) {
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.balance = balance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "primary_owner", referencedColumnName = "id")
    private AccountHolder primaryOwner;

    @ManyToOne
    @JoinColumn(name = "secondary_owner", referencedColumnName = "id")
    private AccountHolder secondaryOwner;

    @Embedded
    @Column(name = "balance")
    private Money balance;


}
