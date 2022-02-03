package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.TradeIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TradeInDao extends JpaRepository<TradeIn, Integer> {

    public TradeIn findByMake(String make);

//    @Query("select i from TradeIn i where i.payoff_balance = :payoff_balance")
//    public TradeIn getByPayoff_balance(@Param("payoff_balance") int payoff_balance);
}
