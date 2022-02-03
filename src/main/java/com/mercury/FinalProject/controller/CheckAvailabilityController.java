package com.mercury.FinalProject.controller;

import com.mercury.FinalProject.bean.CheckAvailability;
import com.mercury.FinalProject.bean.Inventory;
import com.mercury.FinalProject.http.Response;
import com.mercury.FinalProject.service.CheckAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkAvailabilities")
public class CheckAvailabilityController {

    @Autowired
    private CheckAvailabilityService checkAvailabilityService;


    @GetMapping
    public List<CheckAvailability> getAll(){return checkAvailabilityService.getAll();}

    @PostMapping
    public Response save(@RequestBody CheckAvailability checkAvailability) {
        System.out.println("Saving: " + checkAvailability);
        return checkAvailabilityService.save(checkAvailability);
    }

    @PutMapping
    public CheckAvailability edit(@RequestBody CheckAvailability checkAvailability){
        return checkAvailabilityService.editStatus(checkAvailability);
    }


}
