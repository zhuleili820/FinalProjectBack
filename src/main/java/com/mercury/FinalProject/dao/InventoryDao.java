package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InventoryDao extends JpaRepository<Inventory, Integer> {

    public Inventory findByMake(String make);

    @Query("select i from Inventory i where i.price = :price")
    public Inventory getByPrice(@Param("price") int price);


}