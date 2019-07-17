package com.solam.ea.solam_rent.dao;


import com.solam.ea.solam_rent.domain.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccessoriesDAO<T extends Accessories> extends JpaRepository<T, Long> {
}
