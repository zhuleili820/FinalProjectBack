package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Sold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldDao extends JpaRepository<Sold, Integer> {
    public Sold findByVin(String vin);
}
