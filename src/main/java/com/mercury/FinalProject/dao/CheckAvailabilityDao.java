package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.CheckAvailability;
import com.mercury.FinalProject.bean.Inventory;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckAvailabilityDao extends JpaRepository<CheckAvailability, Integer> {

    public CheckAvailability findById(String id);
}
