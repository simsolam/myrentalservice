package com.solam.ea.solam_rent.dao;



import com.solam.ea.solam_rent.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface HotelDAO extends JpaRepository<Hotel, Long> {
}
