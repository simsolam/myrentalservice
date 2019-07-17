package com.solam.ea.solam_rent.controller;



import com.solam.ea.solam_rent.dao.ApartmentDAO;
import com.solam.ea.solam_rent.dao.CarDAO;
import com.solam.ea.solam_rent.dao.HotelDAO;
import com.solam.ea.solam_rent.dao.RentDAO;
import com.solam.ea.solam_rent.domain.Accessories;
import com.solam.ea.solam_rent.domain.Car;
import com.solam.ea.solam_rent.domain.Hotel;
import com.solam.ea.solam_rent.domain.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class RentController {


    @Autowired
    private RentDAO rentService;


    //add new rent
    @PostMapping(value = "/addRent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Rent addRent(@RequestBody Rent rent){
        return rentService.save(rent);
    }

    //list all the rents
    @GetMapping("/getAllRents")
    public List<Rent> getAllRents(){
        return rentService.findAll();
    }

    //find rent by productId
    @GetMapping("/getRentByProductId/{id}")
    public Rent getRentByProductId(@PathVariable long id){
        return rentService.findRentByAccessoriesId(id);
    }

    //Find all rents by customerId
    @GetMapping("/getRentsByCustomerId/{id}")
    public List<Rent> getRentsByCustomerId(@PathVariable long id){
        return rentService.findRentByCustomerId(id);
    }

    //Find all rents by vendorId
    @GetMapping("/getRentsByVendorId/{id}")
    public List<Rent> getRentsByVendorId(@PathVariable long id){
        return rentService.findRentByVendorId(id);
    }

    //Find all rents by rented date
    @GetMapping("/getRentsByRentedDate/{rentFrom}")
    public List<Rent> getRentsByRentedDate(@PathVariable String rentFrom){

        List<Rent> result=new ArrayList<>();
        try {
            Date rentedDate=new SimpleDateFormat("yyyy-MM-dd").parse(rentFrom);
            System.out.println(rentedDate);
            result=rentService.findRentsByRentFromEquals(rentedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //Find all rents by expected returning date
    @GetMapping("/getRentsByExpectedReturnDate/{rentTo}")
    public List<Rent> getRentsByExpectedReturnDate(@PathVariable String rentTo){

        List<Rent> result=new ArrayList<>();
        try {
            Date rentedDate=new SimpleDateFormat("yyyy-MM-dd").parse(rentTo);
            System.out.println(rentedDate);
            result=rentService.findRentsByRentToEquals(rentedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}