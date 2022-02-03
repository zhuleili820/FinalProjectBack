package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCenterDao extends JpaRepository<ServiceCenter, Integer> {
}