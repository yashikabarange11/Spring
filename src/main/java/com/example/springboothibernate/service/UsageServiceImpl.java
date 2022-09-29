package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Usage;
import com.example.springboothibernate.repository.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsageServiceImpl implements UsageService{

    @Autowired
    private UsageRepository usageRepository;

    @Override
    public void saveUsage(Usage usageObj) {
        usageRepository.save(usageObj);
    }

    @Override
    public List<Usage> getUsageDetails(Long id) {
        if(null!=id){
            return usageRepository.findAllById(id);
        }else{
            return usageRepository.findAll();
        }
    }
}
