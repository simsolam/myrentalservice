package com.solam.ea.solam_rent.domain;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private long customerId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date rentFrom;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date rentTo;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date checkOut;

    @NotNull
    private String message;

    @NotNull
    private long vendorId;

    @NotNull
    private long accessoriesId;


    public Rent(@NotNull long customerId,@NotNull long vendorId, @NotNull Date rentFrom, @NotNull Date rentTo, @NotNull Date checkOut, @NotNull long accessoriesId) {
        this.customerId = customerId;
        this.checkOut=checkOut;
        this.vendorId=vendorId;
        this.accessoriesId = accessoriesId;
        this.rentFrom=rentFrom;
        this.rentTo=rentTo;
    }
}