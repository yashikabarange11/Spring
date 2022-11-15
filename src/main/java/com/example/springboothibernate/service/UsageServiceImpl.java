package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Usage;
import com.example.springboothibernate.repository.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UsageServiceImpl implements UsageService {

    @Autowired
    private UsageRepository usageRepository;

    @Override
    public void saveUsage(Usage usageObj) {
        usageRepository.save(usageObj);
    }


    public List<Usage> getUsageDetails(Long id) {
        if (null != id) {
            return usageRepository.findAllById(id);
        } else {
            return usageRepository.findAll();
        }
    }

    @Override
    public void updateUsage(Long id, Usage usage) {
        Usage usageFromDb = usageRepository.findById(id).get();
        //System.out.println(usageFromDb.toString());
        usageFromDb.setBranchName(usage.getBranchName());
        usageFromDb.setReason(usage.getReason());
        usageRepository.save(usageFromDb);
    }

    @Override
    public Usage getUsageById(Long id) {
        return usageRepository.findById(id).get();
    }


}







