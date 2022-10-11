package com.example.springboothibernate.controller;


import com.example.springboothibernate.entity.Usage;
import com.example.springboothibernate.service.UsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usage")
public class UsageController {

    @Autowired
    private UsageService usageService;

    @PostMapping("/save")
    public ResponseEntity createUsage(@RequestBody Usage usageObj){
        usageService.saveUsage(usageObj);
        return  new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getUsage","/{id}"})
    public List<Usage> getUsage(@PathVariable(required = false)Long id){
        return usageService.getUsageDetails(id);
    }



}
