package com.example.springboothibernate.controller;

import com.example.springboothibernate.entity.Instance;
import com.example.springboothibernate.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instance")
public class InstanceController {
    @Autowired
    private InstanceService instanceService;

    @PostMapping("/save")
    public ResponseEntity createInstance(@RequestBody Instance instanceObj){
        instanceService.saveInstance(instanceObj);
        return  new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getInstance","/{id}"})
    public List<Instance> getInstance(@PathVariable(required = false)Long id){
        return instanceService.getInstanceDetails(id);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity remoceInstance(@PathVariable Long id){
        instanceService.deleteInstance(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
