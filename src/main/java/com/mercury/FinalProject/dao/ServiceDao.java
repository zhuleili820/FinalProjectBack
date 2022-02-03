package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDao extends JpaRepository<Service, Integer> {
}