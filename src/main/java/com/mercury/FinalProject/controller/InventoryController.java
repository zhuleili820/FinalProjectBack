package com.mercury.FinalProject.controller;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.dao.InventoryDao;
import com.mercury.FinalProject.http.Response;
import com.mercury.FinalProject.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

	@Autowired
	private InventoryDao inventoryDao;

	@Autowired
	private InventoryService inventoryService;

	@GetMapping
	public List<Inventory> getAll(){return inventoryService.getAll();}

	@PostMapping
	public List<Inventory> save(@RequestBody Inventory inventory) {
		System.out.println("Saving: " + inventory);
		return inventoryService.save(inventory);
	}

	@PutMapping
	public Inventory edit(@RequestBody Inventory inventory){
		return inventoryService.editInventory(inventory);
	}

}