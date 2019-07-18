package com.solam.ea.solam_rent.domain;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String CVC;

    @NotNull
    private String cardNo;

    @NotNull
    private Date expDate;

    @NotNull
    private String nameOnCard;

    @NotNull
    private long customerId;

    @NotNull
    private long rentId;
}
