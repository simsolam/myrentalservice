package com.solam.ea.solam_rent.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Embeddable
public class Address {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;*/

    private String zipCode;
    private String street;
    private String city;
    private String state;

}
