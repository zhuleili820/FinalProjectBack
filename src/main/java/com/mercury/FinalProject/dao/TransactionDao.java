package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {

    public Transaction findByName(String name);

    @Query("select i from Transaction i where i.price = :price")
    public Transaction getByPrice(@Param("price") int price);
}
