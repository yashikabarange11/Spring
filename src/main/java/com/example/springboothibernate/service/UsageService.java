package com.example.springboothibernate.service;

import com.example.springboothibernate.entity.Usage;
import com.example.springboothibernate.repository.UsageRepository;


import java.util.List;

public interface UsageService {


    void saveUsage(Usage usageObj);

    List<Usage>getUsageDetails(Long id);

    void updateUsage(Long id, Usage usage);

    Usage getUsageById(Long id);


}
