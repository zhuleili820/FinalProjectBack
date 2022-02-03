package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeDao extends JpaRepository<Trade, Integer> {
}
