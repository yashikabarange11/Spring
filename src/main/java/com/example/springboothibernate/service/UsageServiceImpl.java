package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Usage;
import com.example.springboothibernate.repository.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
            List<Usage> usageList= usageRepository.findAll();
            for (Usage usage:usageList){
                Long duration = usage.getUpdatedOn()-usage.getCreatedOn();
                usage.setCreatedOnHuman(String.valueOf(duration));
                usage.usageDto();
            }
            return usageList;
        }
    }




}
