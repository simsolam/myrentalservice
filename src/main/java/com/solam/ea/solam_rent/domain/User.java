package com.solam.ea.solam_rent.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password_hash")
    private String passwordHash;

    @NotNull
    @Column(name = "role")
    private String role;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Rent> customerOrders;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vendor")
    private List<Rent> vendorOrders;*/


    public User(@NotNull String name, @NotNull String lastName, @NotNull String email, @NotNull String passwordHash, @NotNull String role) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }
}
