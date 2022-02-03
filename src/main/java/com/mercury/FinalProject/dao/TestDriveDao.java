package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.TestDrive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDriveDao extends JpaRepository<TestDrive, Integer> {
}