package com.mercury.FinalProject.service;


import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.TradeIn;
import com.mercury.FinalProject.dao.TradeInDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeInService {

    @Autowired
    private TradeInDao tradeInDao;

    public List<TradeIn> save(TradeIn tradeIn){
        try{
            tradeInDao.save(tradeIn);
            return tradeInDao.findAll();
        }
        catch (Exception e){
            return null;
        }
    }

    public TradeIn getTradeInById(Integer id){
        return tradeInDao.findById(id).get();
    }

    public List<TradeIn> getAll(){
        return tradeInDao.findAll();
    }


}
