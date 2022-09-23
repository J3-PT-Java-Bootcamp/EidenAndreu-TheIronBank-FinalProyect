package com.example.theironbankfinalproyect.model.users;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id", nullable = false)
    private long id;

    @Column (name = "name")
    private String name;

    private UserType userType;


    public User(String name, UserType userType) {
        this.name = name;
        this.userType = userType;
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
