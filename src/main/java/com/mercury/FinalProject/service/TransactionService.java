package com.mercury.FinalProject.service;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.Transaction;
import com.mercury.FinalProject.dao.SoldDao;
import com.mercury.FinalProject.dao.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TransactionService {
	@Autowired
	private TransactionDao transactionDao;


	public List<Transaction> getAll(){
		return transactionDao.findAll();
	}

	public List<Transaction> save(Transaction transaction){
		try{
			transactionDao.save(transaction);
			return transactionDao.findAll();
		}
		catch (Exception e){
			return null;
		}
	}

	public Transaction editTransaction(Transaction transaction) {
		Transaction t = transactionDao.findById(transaction.getId()).get();
		t = transaction;

		return transactionDao.save(t);

	}

	public Map<String, Double> pieChart (){
		Map<String, Double> chart = new HashMap<>();
		List<Transaction> transactions = transactionDao.findAll();
		List<Transaction> ky1 = transactions.stream().filter(t -> t.getSales().equals("ky1")).collect(Collectors.toList());
		List<Transaction> ky2 = transactions.stream().filter(t -> t.getSales().equals("ky2")).collect(Collectors.toList());
		chart.put("ky1",(double)ky1.size()/ transactions.size());
		chart.put("ky2",(double)ky2.size()/ transactions.size());
		return chart;
	}


}
