package com.solam.ea.solam_rent.dao;



import com.solam.ea.solam_rent.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ApartmentDAO extends JpaRepository<Apartment, Long> {

}
