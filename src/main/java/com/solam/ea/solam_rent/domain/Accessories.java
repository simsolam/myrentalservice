package com.solam.ea.solam_rent.domain;


import com.solam.ea.solam_rent.info.AccessoriesType;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Accessories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String contact;

    @NotNull
    private String email;

    @NotNull
    private String website;

    private String type;

    @OneToOne
    private User vendor;

    @Embedded
    private Address address;

}
