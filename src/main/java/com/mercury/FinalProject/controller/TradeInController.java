package com.mercury.FinalProject.controller;

import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.bean.TradeIn;
import com.mercury.FinalProject.service.TradeInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tradeIns")
public class TradeInController {

    @Autowired
    private TradeInService tradeInService;

    @GetMapping
    public List<TradeIn> getAll(){return tradeInService.getAll();}

    @PostMapping
    public List<TradeIn> save(@RequestBody TradeIn tradeIn) {
        System.out.println("Saving: " + tradeIn);
        return tradeInService.save(tradeIn);
    }





}
