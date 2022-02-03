package com.mercury.FinalProject.service;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.dao.InventoryDao;
import com.mercury.FinalProject.http.InventoryResponse;
import com.mercury.FinalProject.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

	@Autowired
	private InventoryDao inventoryDao;

	public List<Inventory> save(Inventory inventory){
		try{
			inventoryDao.save(inventory);
			return inventoryDao.findAll();
		}
		catch (Exception e){
			return null;
		}
	}

	public Inventory getInventoryById(Integer id){
		return inventoryDao.findById(id).get();
	}

	public List<Inventory> getAll(){
		return inventoryDao.findAll();
	}

	public Inventory editInventory(Inventory inventory) {
		Inventory i = inventoryDao.findById(inventory.getId()).get();
		i = inventory;

		return inventoryDao.save(i);

	}

}