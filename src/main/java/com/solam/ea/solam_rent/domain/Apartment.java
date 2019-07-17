package com.solam.ea.solam_rent.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Apartment extends Accessories {


    private int BHK;
}
