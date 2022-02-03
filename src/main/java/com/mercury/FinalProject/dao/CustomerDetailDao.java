package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailDao extends JpaRepository<CustomerDetail, Integer> {
}

