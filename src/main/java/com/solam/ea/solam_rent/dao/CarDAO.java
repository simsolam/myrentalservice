package com.solam.ea.solam_rent.dao;



import com.solam.ea.solam_rent.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface CarDAO extends JpaRepository<Car, Long> {


}
