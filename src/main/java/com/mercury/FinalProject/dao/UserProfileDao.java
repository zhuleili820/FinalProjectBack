package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileDao extends JpaRepository<UserProfile, Integer> {
}
