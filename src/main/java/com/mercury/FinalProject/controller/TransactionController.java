package com.mercury.FinalProject.controller;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.Transaction;
import com.mercury.FinalProject.http.Response;
import com.mercury.FinalProject.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@GetMapping
	public List<Transaction> getAll() {
		return transactionService.getAll();
	}

	@PostMapping
	public List<Transaction> save(@RequestBody Transaction transaction) {

		return transactionService.save(transaction);
	}

	@PutMapping
	public Transaction edit(@RequestBody Transaction transaction){
		return transactionService.editTransaction(transaction);
	}

	@GetMapping("/pieChart")
	public Map<String, Double> pieChart() {
		return transactionService.pieChart();
	}

}





