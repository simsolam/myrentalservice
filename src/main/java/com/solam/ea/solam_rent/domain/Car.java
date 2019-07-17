package com.solam.ea.solam_rent.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Car extends Accessories {

    private String year;

    private String model;

}
