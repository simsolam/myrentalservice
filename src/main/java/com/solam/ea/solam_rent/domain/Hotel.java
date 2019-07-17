package com.solam.ea.solam_rent.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel extends Accessories {

    private String style;
    private long roomNo;

}
